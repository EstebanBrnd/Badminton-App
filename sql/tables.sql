create table LesJoueurs (
    id integer primary key,
    nom text not null,
    prenom text not null,
    dateNaissance text not null,
    idClub integer not null,
    foreign key (idClub) references LesClubs(id),
    unique (nom, prenom, dateNaissance),
    check (dateNaissance < date('now')),
    check (dateNaissance > date('now', '-100 years')),
    check (idClub > 0),
    check (id > 0)
);

create table LesClubs (
    id integer primary key,
    nom text not null,
    ville text not null,
    sigle text not null,
    unique (nom, ville),
    check (id > 0)
);

create table LesTournois(
    id integer primary key,
    nom text not null,
    dateDebut text not null,
    dateFin text not null,
    idClub integer not null,
    disciplines text not null,
    foreign key (idClub) references LesClubs(id),
    unique (nom, dateDebut, dateFin),
    check (dateDebut < dateFin),
    check (dateDebut > date('now')),
    check (idClub > 0),
    check (id > 0)
);

create table LesClassements(
    id integer primary key,
    pts_simple float not null,
    pts_double float not null,
    pts_mixte float not null,
    foreign key (id) references LesJoueurs(id),
    check (pts_simple >= 0),
    check (pts_double >= 0),
    check (pts_mixte >= 0)
);

create table LesMatchs(
    id integer primary key,
    idTournoi integer not null,
    discipline text not null
);

create table LesMatchsSimple(
    idMatch integer primary key,
    idJoueur1 integer not null,
    idJoueur2 integer not null,
    s1j1 integer not null,
    s1j2 integer not null,
    s2j1 integer not null,
    s2j2 integer not null,
    s3j1 integer,
    s3j2 integer,
    foreign key (idMatch) references LesMatchs(id),
    foreign key (idJoueur1) references LesJoueurs(id),
    foreign key (idJoueur2) references LesJoueurs(id),
    check (s1j1 >= 0),
    check (s1j2 >= 0),
    check (s2j1 >= 0),
    check (s2j2 >= 0)
);

create table LesMatchsDouble(
    idMatch integer primary key,
    idJoueur1 integer not null,
    idJoueur2 integer not null,
    idJoueur3 integer not null,
    idJoueur4 integer not null,
    s1j1 integer not null,
    s1j2 integer not null,
    s2j1 integer not null,
    s2j2 integer not null,
    s3j1 integer,
    s3j2 integer,
    foreign key (idMatch) references LesMatchs(id),
    foreign key (idJoueur1) references LesJoueurs(id),
    foreign key (idJoueur2) references LesJoueurs(id),
    foreign key (idJoueur3) references LesJoueurs(id),
    foreign key (idJoueur4) references LesJoueurs(id),
    check (s1j1 >= 0),
    check (s1j2 >= 0),
    check (s2j1 >= 0),
    check (s2j2 >= 0)
);

create table LesMatchsMixte(
    idMatch integer primary key,
    idJoueur1 integer not null,
    idJoueur2 integer not null,
    idJoueur3 integer not null,
    idJoueur4 integer not null,
    s1j1 integer not null,
    s1j2 integer not null,
    s2j1 integer not null,
    s2j2 integer not null,
    s3j1 integer,
    s3j2 integer,
    foreign key (idMatch) references LesMatchs(id),
    foreign key (idJoueur1) references LesJoueurs(id),
    foreign key (idJoueur2) references LesJoueurs(id),
    foreign key (idJoueur3) references LesJoueurs(id),
    foreign key (idJoueur4) references LesJoueurs(id),
    check (s1j1 >= 0),
    check (s1j2 >= 0),
    check (s2j1 >= 0),
    check (s2j2 >= 0)
);

create table LesInscriptions(
    idJoueur integer not null,
    idTournoi integer not null,
    primary key (idJoueur, idTournoi),
    foreign key (idJoueur) references LesJoueurs(id),
    foreign key (idTournoi) references LesTournois(id)
);