-- PostgreSQL schema and user creation
CREATE USER sample WITH PASSWORD 'sample2022';
CREATE DATABASE sample OWNER sample;
\connect sample
CREATE SCHEMA IF NOT EXISTS public;
GRANT CONNECT ON DATABASE sample TO sample;
GRANT USAGE ON SCHEMA public TO sample;
GRANT SELECT ON ALL TABLES IN SCHEMA public TO sample;
GRANT ALL ON ALL TABLES IN SCHEMA public TO sample;
