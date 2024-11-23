CREATE TABLE IF NOT EXISTS customer (
    id SERIAL PRIMARY KEY,
    nui VARCHAR(20) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    addres VARCHAR(200),
    age INT CHECK (age >= 0),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE IF NOT EXISTS invoice (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2) CHECK (total >= 0),
    customer_id INT REFERENCES customer(id)
);

CREATE TABLE IF NOT EXISTS leads (
    id SERIAL PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    contact_info VARCHAR(150),
    status VARCHAR(50) CHECK (status IN ('New', 'In Progress', 'Converted', 'Closed')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );


CREATE TABLE IF NOT EXISTS activities (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    type VARCHAR(50) CHECK (type IN ('Call', 'Meeting', 'Email', 'Other')),
    leads_id INT REFERENCES leads(id) ON DELETE CASCADE
);





