create table Arvostelu(
    id int auto_increment not null,
    paikka varchar(50) not null,
    paiva varchar(50),
	arvosana char(10) not null,
    kuvaus varchar(500),
    primary key (id))
ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO Arvostelu (paikka, paiva, arvosana, kuvaus)
VALUES 
    ("Matin mesta", "02.02.2017", "1", "meno aika meh"),
    ("Amsterdam", "12.05.2017", "4", "Oikeen hyv� oluthuone Ruoholahdessa"),
	("Willi W�in�", "02.02.2017", "4", "Oluthuone Helsingin keskustassa. L�ytyy my�s sahtia, mik� on aina plussaa.");