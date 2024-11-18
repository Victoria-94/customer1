CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    nui VARCHAR(20) NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    addres VARCHAR(200),
    age INT CHECK (age >= 0),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE IF NOT EXISTS invoice (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2) CHECK (total >= 0),
    client_id INT REFERENCES customer(id)
);

