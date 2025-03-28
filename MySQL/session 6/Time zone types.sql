SELECT LOCALTIMESTAMP AS TIME FROM DUAL; --> CURRENT DATE/ TIME AS TIMESTAMP

SELECT SESSIONTIMEZONE AS TIME FROM DUAL; --> CURRENT SESSION TIME ZONE

SELECT TZ_OFFSET('Asia/Calcutta') AS TIME FROM DUAL; --> HOW IS THE TIMEZONE OFFSET(AHEAD OR BACK)

SELECT CURRENT_TIMESTAMP AS TIME FROM DUAL; --> CURRENT SESSION DATE/ TIME AS TIME ZONE

SELECT SYSTIMESTAMP AS TIME FROM DUAL; --> CURRENT DATABASE DATE/ TIME AS TIME ZONE

SELECT FROM_TZ(TIMESTAMP '2022-02-28 21:44:00', '+03:00') AS TIME FROM DUAL; --> ADDING A TIMEZONE

SELECT CAST(NEW_TIME(TO_DATE('2022-02-28 21:44:00', 'YYYY-MM-DD HH24:MI:SS'), 'EST', 'GMT')AS TIMESTAMP(6)) AS TIME FROM DUAL;
--> CONVERTING BETWEEN TIME ZONES, AND CONVERTING TIME.

SELECT SYS_EXTRACT_UTC(TIMESTAMP '2022-02-28 21:44:00 -08:00') AS TIME FROM DUAL; --> CONVERTING TO GMT/UTC

SELECT TO_DATE('2022-02-28 21:44:00', 'YYYY-MM-DD HH24:MI:SS') AS TIME FROM DUAL; --> CONVERTING TO STANDARD DATE

SELECT TO_TIMESTAMP('2022-02-28 21:44:00', 'YYYY-MM-DD HH24:MI:SS') AS TIME FROM DUAL; --> CONVERTING TO STANDARD TIMESTAMP

SELECT TO_TIMESTAMP_TZ('2022-02-28 21:44:00 -08:00', 'YYYY-MM-DD HH24:MI:SS TZH:TZM') AS TIME FROM DUAL; --> CONVERTING TO TIME ZONE

-- https://www.timeanddate.com/time/zones/