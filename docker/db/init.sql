CREATE TABLE IF NOT EXISTS regional_entity
(
    id                SERIAL PRIMARY KEY,
    name              VARCHAR(50) NOT NULL,
    capital           VARCHAR(50) NOT NULL,
    population        INTEGER     NOT NULL,
    square_kilometers INTEGER     NOT NULL,
    hi_altitude       INTEGER     NOT NULL,
    lo_altitude       INTEGER     NOT NULL,
    created_at        timestamp default current_timestamp
);

CREATE INDEX IF NOT EXISTS ix_country_name ON regional_entity (name);
