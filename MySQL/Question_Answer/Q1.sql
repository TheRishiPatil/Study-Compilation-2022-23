CREATE TABLE WORLD (
    NAME VARCHAR(30) NOT NULL
    , CONTINENT VARCHAR(30) NULL
    , AREA INT NOT NULL
    , POPULATION INT NOT NULL
    , GDP INT NOT NULL
    , CONSTRAINT WORLD_NAME PRIMARY KEY(NAME)
    );
    
SELECT NAME, POPULATION, AREA 
FROM WORLD
WHERE AREA >= 3000000 OR POPULATION >= 25000000
;

insert into World (name, continent, area, population, gdp) values ('Afghanistan', 'Asia', '652230', '25500100', '20343000000');
insert into World (name, continent, area, population, gdp) values ('Albania', 'Europe', '28748', '2831741', '12960000000');
insert into World (name, continent, area, population, gdp) values ('Algeria', 'Africa', '2381741', '37100000', '188681000000');
insert into World (name, continent, area, population, gdp) values ('Andorra', 'Europe', '468', '78115', '3712000000');
insert into World (name, continent, area, population, gdp) values ('Angola', 'Africa', '1246700', '20609294', '100990000000');

DROP TABLE WORLD;

Truncate table World;