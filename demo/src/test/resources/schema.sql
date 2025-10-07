CREATE TABLE IF NOT EXISTS messages (
                                        id   UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
                                        text VARCHAR NOT NULL
);