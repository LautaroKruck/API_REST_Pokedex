
# INSERT INTO tipos (tipo) VALUES
# ('Planta'), ('Veneno'), ('Fuego'), ('Volador'), ('Agua'),
# ('Bicho'), ('Normal'), ('Eléctrico'), ('Tierra'), ('Hada'),
# ('Lucha'), ('Psíquico'), ('Roca'), ('Hielo'), ('Fantasma'), ('Dragón');
INSERT INTO tipos (tipo) VALUES ('Planta'), ('Veneno'), ('Fuego'), ('Volador'), ('Agua'), ('Bicho'), ('Normal'), ('Eléctrico'), ('Tierra'), ('Hada'), ('Lucha'), ('Psíquico'), ('Roca'), ('Hielo'), ('Fantasma'), ('Dragón');

# INSERT INTO ataques (nombre, danio_base, is_especial, id_tipo) VALUES
#  ('Leaf Attack', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')),
#  ('Poison Sting', 30, true, (SELECT tipo FROM tipos WHERE tipo = 'Veneno')),
#  ('Flame Thrower', 55, true, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')),
#  ('Gust', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')),
#  ('Water Splash', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')),
#  ('Bug Bite', 35, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
#  ('Scratch', 30, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal')),
#  ('Thunder Shock', 40, true, (SELECT tipo FROM tipos WHERE tipo = 'Eléctrico')),
#  ('Mud Shot', 35, false, (SELECT tipo FROM tipos WHERE tipo = 'Tierra')),
#  ('Fairy Wind', 40, true, (SELECT tipo FROM tipos WHERE tipo = 'Hada')),
#  ('Punch', 50, false, (SELECT tipo FROM tipos WHERE tipo = 'Lucha')),
#  ('Psychic Blast', 60, true, (SELECT tipo FROM tipos WHERE tipo = 'Psíquico')),
#  ('Rock Throw', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Roca')),
#  ('Ice Shard', 45, true, (SELECT tipo FROM tipos WHERE tipo = 'Hielo')),
#  ('Shadow Ball', 55, true, (SELECT tipo FROM tipos WHERE tipo = 'Fantasma')),
#  ('Dragon Breath', 60, true, (SELECT tipo FROM tipos WHERE tipo = 'Dragón'));
INSERT INTO ataques (nombre, danio_base, is_especial, id_tipo) VALUES ('Leaf Attack', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')), ('Poison Sting', 30, true, (SELECT tipo FROM tipos WHERE tipo = 'Veneno')), ('Flame Thrower', 55, true, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')), ('Gust', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')), ('Water Splash', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')), ('Bug Bite', 35, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Scratch', 30, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal')), ('Thunder Shock', 40, true, (SELECT tipo FROM tipos WHERE tipo = 'Eléctrico')), ('Mud Shot', 35, false, (SELECT tipo FROM tipos WHERE tipo = 'Tierra')), ('Fairy Wind', 40, true, (SELECT tipo FROM tipos WHERE tipo = 'Hada')), ('Punch', 50, false, (SELECT tipo FROM tipos WHERE tipo = 'Lucha')), ('Psychic Blast', 60, true, (SELECT tipo FROM tipos WHERE tipo = 'Psíquico')), ('Rock Throw', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Roca')), ('Ice Shard', 45, true, (SELECT tipo FROM tipos WHERE tipo = 'Hielo')), ('Shadow Ball', 55, true, (SELECT tipo FROM tipos WHERE tipo = 'Fantasma')), ('Dragon Breath', 60, true, (SELECT tipo FROM tipos WHERE tipo = 'Dragón'));

# INSERT INTO pokemon (nombre, vida, is_shiny, id_tipo) VALUES
# ('Bulbasaur', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')),
# ('Ivysaur', 60, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')),
# ('Venusaur', 80, true, (SELECT tipo FROM tipos WHERE tipo = 'Planta')),
# ('Charmander', 39, false, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')),
# ('Charmeleon', 58, false, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')),
# ('Charizard', 78, true, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')),
# ('Squirtle', 44, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')),
# ('Wartortle', 59, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')),
# ('Blastoise', 79, true, (SELECT tipo FROM tipos WHERE tipo = 'Agua')),
# ('Caterpie', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Metapod', 50, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Butterfree', 60, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Weedle', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Kakuna', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Beedrill', 65, true, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')),
# ('Pidgey', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')),
# ('Pidgeotto', 63, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')),
# ('Pidgeot', 83, true, (SELECT tipo FROM tipos WHERE tipo = 'Volador')),
# ('Rattata', 30, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal')),
# ('Raticate', 55, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal'));

INSERT INTO pokemon (nombre, vida, is_shiny, id_tipo) VALUES ('Bulbasaur', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')), ('Ivysaur', 60, false, (SELECT tipo FROM tipos WHERE tipo = 'Planta')), ('Venusaur', 80, true, (SELECT tipo FROM tipos WHERE tipo = 'Planta')), ('Charmander', 39, false, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')), ('Charmeleon', 58, false, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')), ('Charizard', 78, true, (SELECT tipo FROM tipos WHERE tipo = 'Fuego')), ('Squirtle', 44, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')), ('Wartortle', 59, false, (SELECT tipo FROM tipos WHERE tipo = 'Agua')), ('Blastoise', 79, true, (SELECT tipo FROM tipos WHERE tipo = 'Agua')), ('Caterpie', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Metapod', 50, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Butterfree', 60, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Weedle', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Kakuna', 45, false, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Beedrill', 65, true, (SELECT tipo FROM tipos WHERE tipo = 'Bicho')), ('Pidgey', 40, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')), ('Pidgeotto', 63, false, (SELECT tipo FROM tipos WHERE tipo = 'Volador')), ('Pidgeot', 83, true, (SELECT tipo FROM tipos WHERE tipo = 'Volador')), ('Rattata', 30, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal')), ('Raticate', 55, false, (SELECT tipo FROM tipos WHERE tipo = 'Normal'));

# INSERT INTO pokemon_ataque (id_pokemon, id_ataque) VALUES
# ((SELECT id FROM pokemon WHERE nombre = 'Bulbasaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')),
# ((SELECT id FROM pokemon WHERE nombre = 'Ivysaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')),
# ((SELECT id FROM pokemon WHERE nombre = 'Venusaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')),
# ((SELECT id FROM pokemon WHERE nombre = 'Charmander'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')),
# ((SELECT id FROM pokemon WHERE nombre = 'Charmeleon'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')),
# ((SELECT id FROM pokemon WHERE nombre = 'Charizard'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')),
# ((SELECT id FROM pokemon WHERE nombre = 'Squirtle'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')),
# ((SELECT id FROM pokemon WHERE nombre = 'Wartortle'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')),
# ((SELECT id FROM pokemon WHERE nombre = 'Blastoise'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')),
# ((SELECT id FROM pokemon WHERE nombre = 'Caterpie'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')),
# ((SELECT id FROM pokemon WHERE nombre = 'Metapod'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')),
# ((SELECT id FROM pokemon WHERE nombre = 'Butterfree'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')),
# ((SELECT id FROM pokemon WHERE nombre = 'Weedle'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')),
# ((SELECT id FROM pokemon WHERE nombre = 'Kakuna'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')),
# ((SELECT id FROM pokemon WHERE nombre = 'Beedrill'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')),
# ((SELECT id FROM pokemon WHERE nombre = 'Pidgey'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')),
# ((SELECT id FROM pokemon WHERE nombre = 'Pidgeotto'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')),
# ((SELECT id FROM pokemon WHERE nombre = 'Pidgeot'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')),
# ((SELECT id FROM pokemon WHERE nombre = 'Rattata'), (SELECT nombre FROM ataques WHERE nombre = 'Scratch')),
# ((SELECT id FROM pokemon WHERE nombre = 'Raticate'), (SELECT nombre FROM ataques WHERE nombre = 'Scratch'));
INSERT INTO pokemon_ataque (id_pokemon, id_ataque) VALUES ((SELECT id FROM pokemon WHERE nombre = 'Bulbasaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')), ((SELECT id FROM pokemon WHERE nombre = 'Ivysaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')), ((SELECT id FROM pokemon WHERE nombre = 'Venusaur'), (SELECT nombre FROM ataques WHERE nombre = 'Leaf Attack')), ((SELECT id FROM pokemon WHERE nombre = 'Charmander'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')), ((SELECT id FROM pokemon WHERE nombre = 'Charmeleon'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')), ((SELECT id FROM pokemon WHERE nombre = 'Charizard'), (SELECT nombre FROM ataques WHERE nombre = 'Flame Thrower')), ((SELECT id FROM pokemon WHERE nombre = 'Squirtle'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')), ((SELECT id FROM pokemon WHERE nombre = 'Wartortle'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')), ((SELECT id FROM pokemon WHERE nombre = 'Blastoise'), (SELECT nombre FROM ataques WHERE nombre = 'Water Splash')), ((SELECT id FROM pokemon WHERE nombre = 'Caterpie'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')), ((SELECT id FROM pokemon WHERE nombre = 'Metapod'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')), ((SELECT id FROM pokemon WHERE nombre = 'Butterfree'), (SELECT nombre FROM ataques WHERE nombre = 'Bug Bite')), ((SELECT id FROM pokemon WHERE nombre = 'Weedle'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')), ((SELECT id FROM pokemon WHERE nombre = 'Kakuna'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')), ((SELECT id FROM pokemon WHERE nombre = 'Beedrill'), (SELECT nombre FROM ataques WHERE nombre = 'Poison Sting')), ((SELECT id FROM pokemon WHERE nombre = 'Pidgey'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')), ((SELECT id FROM pokemon WHERE nombre = 'Pidgeotto'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')), ((SELECT id FROM pokemon WHERE nombre = 'Pidgeot'), (SELECT nombre FROM ataques WHERE nombre = 'Gust')), ((SELECT id FROM pokemon WHERE nombre = 'Rattata'), (SELECT nombre FROM ataques WHERE nombre = 'Scratch')), ((SELECT id FROM pokemon WHERE nombre = 'Raticate'), (SELECT nombre FROM ataques WHERE nombre = 'Scratch'));
