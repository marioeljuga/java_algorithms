WITH Dow AS (
    SELECT (EXTRACT dow from Bis) as Dow
    FROM Nutzungen
)
WITH DowCount AS (
    SELECT COUNT(Dow)
    FROM Dow
    GROUP BY Dow
)
SELECT MAX(Dow)
FROM DowCount;