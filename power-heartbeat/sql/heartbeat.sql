CREATE TABLE
    heartbeat
    (
        id BIGINT NOT NULL,
        hb_date DATETIME,
        power_available BOOLEAN NOT NULL,
		PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO heartbeat (id, hb_date, power_available)
  VALUES (1, 4419619200000, 1);
INSERT INTO heartbeat (id, hb_date, power_available)
  VALUES (1, 4419619300000, 1);
INSERT INTO heartbeat (id, hb_date, power_available)
  VALUES (1, 4419619400000, 0);

INSERT INTO hibernate_sequence (next_val) VALUES (4);