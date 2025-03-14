ACCEPT myoption PROMPT 'What Option You Want';
SELECT CASE
    WHEN '&myOption' = 'Option A' THEN 'First Option'
    WHEN '&myOption' = 'Option B' THEN 'Second Option'
    ELSE 'No Option'
END AS myOptions 
FROM DUAL;