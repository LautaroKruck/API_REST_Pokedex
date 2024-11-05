INSERT INTO tipos (tipo) VALUES ('Fuego')

INSERT INTO pokemon (nombre, vida, isShiny, id_tipo) VALUES ('Charizard', 360, false, 'Fuego');

INSERT INTO ataques (nombre, danioBase, isEspecial, id_tipo, id_pokemon) VALUES ('Lanzallamas', 90, true, 'Fuego', (SELECT id FROM pokemon WHERE nombre = 'Charizard'));


