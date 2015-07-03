SELECT a.id, b.description,b.answer,b.component, a.wronganswer,  a.relatederror,  g.description as errortype, i.description as suberrortype,
h.description as merfunction, e.description
FROM remediation a 
left join goal b on a.id_goal = b.id
left join itemsorter c on a.id_itemsorter = c.id
left join criterion d on a.id_criterion = d.id
left join mer e on a.id_mer = e.id
left join sorter f on c.id_sorter = f.id
left join errortype g on g.id =c.id_errortype
left join merfunction h on h.id = c.id_merfunction
left join suberrortype i on i.id = c.id_suberrortype

