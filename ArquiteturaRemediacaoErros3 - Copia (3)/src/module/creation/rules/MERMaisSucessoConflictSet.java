package module.creation.rules;

import java.util.Vector;

import jeops.conflict.AbstractConflictSet;
import jeops.conflict.ConflictSetElement;
import jeops.conflict.NoMoreElementsException;

public class MERMaisSucessoConflictSet
  extends AbstractConflictSet
{
  private Vector fireableRules;
  private Vector history;
  private int size;
  
  public MERMaisSucessoConflictSet()
  {
    flush();
  }
  
  private void ensureFireableRulesCapacity(int size)
  {
    while (this.fireableRules.size() < size) {
      this.fireableRules.addElement(new Vector());
    }
  }
  
  public void flush()
  {
    this.fireableRules = new Vector();
    this.history = new Vector();
    this.size = 0;
  }
  
  public void insertElement(ConflictSetElement element)
  {
    int ruleIndex = element.getRuleIndex();
    ensureFireableRulesCapacity(ruleIndex + 1);
    Vector rules = (Vector)this.fireableRules.elementAt(ruleIndex);
    if (!rules.contains(element))
    {
      rules.addElement(element);
      elementAdded(element);
      this.size += 1;
    }
  }
  
  public boolean isEmpty()
  {
    return this.size == 0;
  }
  
  public ConflictSetElement nextElement()
    throws NoMoreElementsException
  {
    ConflictSetElement result = null;
    if (this.size == 0) {
      throw new NoMoreElementsException("Empty conflict set");
    }
    for (int i = this.history.size() - 1; (result == null) && (i >= 0); i--)
    {
      Integer aux = (Integer)this.history.elementAt(i);
      int ruleNumber = aux.intValue();
      Vector rules = (Vector)this.fireableRules.elementAt(ruleNumber);
      if (rules.size() != 0)
      {
        result = (ConflictSetElement)rules.elementAt(0);
        rules.removeElementAt(0);
        if (i != this.history.size() - 1)
        {
          this.history.removeElement(aux);
          this.history.addElement(aux);
        }
      }
    }
    if (result == null) {
      for (int i = 0; (result == null) && (i < this.fireableRules.size()); i++)
      {
        Vector rules = (Vector)this.fireableRules.elementAt(i);
        if (rules.size() != 0)
        {
          result = (ConflictSetElement)rules.elementAt(0);
          rules.removeElementAt(0);
          Integer aux = new Integer(i);
          this.history.addElement(aux);
        }
      }
    }
    this.size -= 1;
    return result;
  }
  
  public void removeElementsWith(Object obj)
  {
    this.size -= removeElementsWith_2D(this.fireableRules, obj);
  }
}