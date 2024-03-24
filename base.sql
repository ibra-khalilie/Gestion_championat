/*user*/

INSERT INTO `gestion_championnat`.`user`
(`email`, `login`, `mdp`, `nom`, `prenom`, `pseudo`)
VALUES
('john.doe@example.com', 'admin', 'admin', 'Doe', 'John', 'johnny'),
('alice.smith@example.com', 'admin2', 'admin2', 'Smith', 'Alice', 'ali'),
('bob.brown@example.com', 'bob_brown', 'password3', 'Brown', 'Bob', 'bobby'),
('emma.taylor@example.com', 'emma_taylor', 'password4', 'Taylor', 'Emma', 'em');


/*stade*/
INSERT INTO `gestion_championnat`.`stade`
(`nom`, `adresse`, `capacite`, `telephone`)
VALUES
('Stade de France', '1 Rue du Moulin, 93200 Saint-Denis', '80000', '+33 1 55 93 00 00'),
('Parc des Princes', '24 Rue du Commandant Guilbaud, 75016 Paris', '48000', '+33 1 47 43 71 71'),
('Groupama Stadium', '10 Avenue Simone Veil, 69150 Décines-Charpieu', '59186', '+33 4 81 07 55 00'),
('Stade Vélodrome', '3 Boulevard Michelet, 13008 Marseille', '67000', '+33 4 91 76 56 00'),
('Allianz Riviera', 'Boulevard des Jardiniers, 06200 Nice', '35624', '+33 4 97 07 05 00'),
('Matmut Atlantique', 'Cours Jules Ladoumègue, 33300 Bordeaux', '42115', '+33 5 56 04 19 30'),
('Stade Geoffroy-Guichard', '14 Rue Paul et Pierre Guichard, 42000 Saint-Étienne', '41965', '+33 4 77 92 65 00'),
('Stade Louis II', 'Avenue des Castelans, 98000 Monaco', '18500', '+377 92 05 74 73'),
('Stade Pierre-Mauroy', '261 Boulevard de Tournai, 59650 Villeneuve-d''Ascq', '50083', '+33 3 20 67 34 34'),
('Roazhon Park', '111 Rue de Lorient, 35000 Rennes', '29562', '+33 2 99 14 20 00');


/*pays*/
INSERT INTO `gestion_championnat`.`pays`
(`nom`, `logo`)
VALUES
('France', 'drapeau_france.png'),
('Espagne', 'drapeau_espagne.png'),
('Angleterre', 'drapeau_angleterre.png'),
('Allemagne', 'drapeau_allemagne.png'),
('Italie', 'drapeau_italie.png');

/*equipe*/
INSERT INTO `gestion_championnat`.`equipe`
(`nom`, `date_de_creation`, `logo`, `nom_entraineur`, `president`, `statut`, `siege`, `numero`, `site_Web`, `stade_id`)
VALUES
('Paris Saint-Germain', '1970-08-12', 'psg.png', 'Mauricio Pochettino', 'Nasser Al-Khelaifi', 'Professionnel', 'Paris, France', '1', 'https://www.psg.fr', 1),
('Olympique de Marseille', '1899-08-31', 'om.png', 'Jorge Sampaoli', 'Pablo Longoria', 'Professionnel', 'Marseille, France', '2', 'https://www.om.fr', 4),
('Olympique Lyonnais', '1950-05-01', 'ol.png', 'Peter Bosz', 'Jean-Michel Aulas', 'Professionnel', 'Lyon, France', '3', 'https://www.ol.fr', 7),
('AS Monaco', '1924-08-01', 'monaco.png', 'Philippe Clement', 'Dmitry Rybolovlev', 'Professionnel', 'Monaco', '4', 'https://www.asmonaco.com', 8),
('Stade Rennais FC', '1901-03-10', 'rennes.png', 'Bruno Génésio', 'Nicolas Holveck', 'Professionnel', 'Rennes, France', '5', 'https://www.staderennais.com', 10),
('FC Barcelona', '1899-11-29', 'barcelona.png', 'Xavi Hernandez', 'Joan Laporta', 'Professionnel', 'Barcelona, Spain', '6', 'https://www.fcbarcelona.com', 3),
('Real Madrid CF', '1902-03-06', 'realmadrid.png', 'Carlo Ancelotti', 'Florentino Pérez', 'Professionnel', 'Madrid, Spain', '7', 'https://www.realmadrid.com', 9),
('Liverpool FC', '1892-06-03', 'liverpool.png', 'Jürgen Klopp', 'Tom Werner', 'Professionnel', 'Liverpool, England', '8', 'https://www.liverpoolfc.com', 2),
('Manchester United FC', '1878-05-01', 'manunited.png', 'Ralf Rangnick', 'Joel Glazer', 'Professionnel', 'Manchester, England', '9', 'https://www.manutd.com', 5),
('Juventus FC', '1897-11-01', 'juventus.png', 'Massimiliano Allegri', 'Andrea Agnelli', 'Professionnel', 'Turin, Italy', '10', 'https://www.juventus.com', 6);

/*championnat*/
INSERT INTO `gestion_championnat`.`championnat`
(`nom`, `logo`, `date_Debut`, `date_Fin`, `point_Perdu`, `point_Null`, `type_Classement`, `pays_id`)
VALUES
('Ligue 1', 'ligue1.png', '2024-01-01', '2024-12-31', 1, 0, 'Standard', 1),
('Premier League', 'premierleague.png', '2024-08-01', '2025-05-31', 2, 0, 'Standard', 3),
('La Liga', 'laliga.png', '2024-09-01', '2025-06-30', 1, 1, 'Standard', 2),
('Bundesliga', 'bundesliga.png', '2024-08-01', '2025-05-31', 2, 0, 'Standard', 4),
('Serie A', 'seriea.png', '2024-09-01', '2025-06-30', 1, 1, 'Standard', 5);

/*journée*/
INSERT INTO `gestion_championnat`.`journee`
(`numero`, `championnat_id`)
VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 2),
(5, 2),
(6, 3),
(7, 3),
(8, 4),
(9, 5),
(10, 5);

/*Game*/
INSERT INTO `gestion_championnat`.`game`
(`point_Equipe1`, `point_Equipe2`, `id_Equipe1`, `id_Equipe2`, `date`, `stade_id`, `equipe1_id`, `equipe2_id`, `journee_id`)
VALUES
(2, 1, 1, 2, '2024-10-01', 1, 1, 2, 1),
(3, 0, 3, 4, '2024-10-05', 2, 2, 3, 1),
(1, 1, 5, 6, '2024-10-10', 3, 3, 1, 2),
(2, 3, 7, 8, '2024-10-01', 4, 4, 5, 3),
(2, 2, 9, 10, '2024-10-05', 5, 5, 6, 4),
(3, 3, 1, 3, '2024-10-10', 6, 7, 8, 5),
(0, 2, 4, 5, '2024-10-01', 7, 8, 9, 6),
(1, 1, 6, 7, '2024-10-05', 8, 10, 1, 7),
(2, 2, 8, 9, '2024-10-10', 9, 2, 3, 8),
(3, 1, 10, 1, '2024-10-01', 10, 4, 5, 9),
(1, 0, 2, 3, '2024-10-05', 1, 6, 7, 10),
(2, 1, 3, 4, '2024-10-10', 2, 8, 9, 1),
(2, 2, 5, 6, '2024-10-01', 3, 10, 1, 2),
(1, 1, 7, 8, '2024-10-05', 4, 2, 3, 3),
(0, 3, 9, 10, '2024-10-10', 5, 4, 5, 4),
(2, 1, 1, 2, '2024-10-01', 1, 1, 2, 1),
(3, 0, 3, 4, '2024-10-01', 2, 2, 3, 1),
(1, 1, 5, 6, '2024-10-01', 3, 3, 1, 1),
(2, 3, 7, 8, '2024-10-01', 4, 4, 5, 1),
(2, 2, 9, 10, '2024-10-01', 5, 5, 6, 1),
(3, 3, 1, 3, '2024-10-01', 6, 7, 8, 1),
(0, 2, 4, 5, '2024-10-01', 7, 8, 9, 1),
(1, 1, 6, 7, '2024-10-01', 8, 10, 1, 1),
(2, 2, 8, 9, '2024-10-01', 9, 2, 3, 1),
(3, 1, 10, 1, '2024-10-01', 10, 4, 5, 1),
(1, 0, 2, 3, '2024-10-01', 1, 6, 7, 1),
(2, 1, 3, 4, '2024-10-01', 2, 8, 9, 1),
(2, 2, 5, 6, '2024-10-01', 3, 10, 1, 1),
(1, 1, 7, 8, '2024-10-01', 4, 2, 3, 1),
(0, 3, 9, 10, '2024-10-01', 5, 4, 5, 1),
(2, 1, 11, 12, '2024-10-08', 1, 1, 2, 2),
(3, 0, 13, 14, '2024-10-08', 2, 2, 3, 2),
(1, 1, 15, 16, '2024-10-08', 3, 3, 1, 2),
(2, 3, 17, 18, '2024-10-05', 4, 4, 5, 2),
(2, 2, 19, 20, '2024-10-05', 5, 5, 6, 2),
(3, 3, 21, 22, '2024-10-05', 6, 7, 8, 2),
(0, 2, 23, 24, '2024-10-05', 7, 8, 9, 2),
(1, 1, 25, 26, '2024-10-03', 8, 10, 1, 2),
(2, 2, 27, 28, '2024-10-03', 9, 2, 3, 2),
(3, 1, 29, 30, '2024-10-03', 10, 4, 5, 2),
(1, 0, 31, 32, '2024-10-05', 1, 6, 7, 2),
(2, 1, 33, 34, '2024-10-05', 2, 8, 9, 2),
(2, 2, 35, 36, '2024-10-02', 3, 10, 1, 2),
(1, 1, 37, 38, '2024-10-02', 4, 2, 3, 2),
(0, 3, 39, 40, '2024-10-02', 5, 4, 5, 2);


