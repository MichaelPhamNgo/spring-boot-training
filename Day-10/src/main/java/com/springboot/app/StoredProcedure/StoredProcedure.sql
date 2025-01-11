DELIMITER $$
CREATE PROCEDURE number_of_cities_for_country(
	IN Country CHAR(3),
    OUT total INT
)
BEGIN
	SELECT COUNT(*) INTO total FROM city WHERE CountryCode = Country;
END$$
DELIMITER ;
