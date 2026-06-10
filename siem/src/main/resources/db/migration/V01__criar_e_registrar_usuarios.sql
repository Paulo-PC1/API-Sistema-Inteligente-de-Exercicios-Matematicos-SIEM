CREATE TABLE user (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(200) NOT NULL,
	email VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	active TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, email, password, active) values
	(1, "Paulo Cezar", "paulocezar@email.com", "962F42B7F14627731A6289B11A6E90155DBDD477", 1),
	(2, "José Henrique", "henriquejose@email.com", "ECC355B3F6FCCB91EAA658804FBDD33140B83761", 1),
	(3, "Ana Maria", "mariaana@email.com", "097CE3F3F0459FFD4B554E2ACE3C423B8BD27565", 1),
	(4, "Maria Laura", "lauramaria@email.com", "3A6BFA2E81765F61E3D0F142D34C7D5918489476", 1),
	(5, "Claudio", "claudio@email.com", "28712A739A1A6AA667EF7CF59F7E471A3EECBFC3", 1);