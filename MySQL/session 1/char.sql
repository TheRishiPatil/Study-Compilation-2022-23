CREATE TABLE Rishi
(Character CHAR(15), Varcharacter2 VARCHAR2(15), Ncharacter NCHAR(15), Nvarcharacter2 NVARCHAR2(15));

INSERT INTO Rishi 
VALUES ('Rishi', 'Rishi', 'Rishi', 'Rishi');

SELECT Character || '.',  Varcharacter2 || '.', Ncharacter || '.', Nvarcharacter2 || '.', 
LENGTH(Character) AS NumberOfChar, LENGTHB(Character) AS NumberOfCharBytes,
LENGTH(Varcharacter2) AS NumberOfVarchar, LENGTHB(varcharacter2) AS NumberOfVarcharBytes,
LENGTH(Ncharacter) AS NumberOfNchar, LENGTHB(Ncharacter) AS NumberOfNcharBytes,
LENGTH(Nvarcharacter2) AS NumberOfNvarchar, LENGTHB(Nvarcharacter2) AS NumberOfNvarcharBytes
FROM Rishi;

TRUNCATE TABLE Rishi;
DROP TABLE Rishi;

-- CHAR --> Fixed Length, Computer Decides Coding System, 2000 Bytes Or Characters.
--VARCHAR2 --> Variable Length, Computer Decides Coding System, 4000 Bytes Or Characters Extend Upto 32,767(Optionally).
--NCHAR --> Fixed Length, Unicode, 2000 Bytes Or Characters.
--NVARCHAR2 --> Variable Length, Unicode, 4000 Bytes Or Characters Extend Upto 32,767(Optionally).
