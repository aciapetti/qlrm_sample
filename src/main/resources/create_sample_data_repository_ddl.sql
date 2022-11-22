--
-- PostgreSQL database dump
--

-- Dumped from database version 12.8
-- Dumped by pg_dump version 12.8

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;
SET search_path TO sample,public;

--
-- Name: pgcrypto; Type: EXTENSION; Schema: public; Owner: sample
--
CREATE EXTENSION IF NOT EXISTS pgcrypto WITH SCHEMA public;

--
-- Name: EXTENSION pgcrypto; Type: COMMENT; Schema: -; Owner: 
--
COMMENT ON EXTENSION pgcrypto IS 'cryptographic functions';

--
-- Name: uuid-ossp; Type: EXTENSION; Schema: public; Owner: sample
--
CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA public;

--
-- Name: EXTENSION "uuid-ossp"; Type: COMMENT; Schema: public; Owner: sample
--
COMMENT ON EXTENSION "uuid-ossp" IS 'generate universally unique identifiers (UUIDs)';

SET default_tablespace = '';
SET default_table_access_method = heap;

--
-- Name: investigations; Type: TABLE; Schema: public; Owner: sample
--
CREATE TABLE public.investigations (
    id uuid DEFAULT public.uuid_generate_v1mc() NOT NULL,
    name bytea NOT NULL,
    description bytea,
    enable boolean DEFAULT true NOT NULL
);

ALTER TABLE public.investigations OWNER TO sample;

INSERT INTO public.investigations(name, description) VALUES(pgp_sym_encrypt('Mona Lisa operation', 'very secure encryption key!'), pgp_sym_encrypt('Investigation on disappearance of Leonardo painting Mona Lisa', 'very secure encryption key!'));
INSERT INTO public.investigations(name, description) VALUES(pgp_sym_encrypt('Drug trading fight operation', 'very secure encryption key!'), pgp_sym_encrypt('Investigation on clandestine drug trading', 'very secure encryption key!'));

--
-- Name: investigations investigations_pkey; Type: CONSTRAINT; Schema: public; Owner: sample
--
ALTER TABLE ONLY public.investigations ADD CONSTRAINT investigations_pkey PRIMARY KEY (id);

--
-- Name: investigations_id_uindex; Type: INDEX; Schema: public; Owner: sample
--
CREATE UNIQUE INDEX investigations_id_uindex ON public.investigations USING btree (id);

--
-- Name: investigations_name_uindex; Type: INDEX; Schema: public; Owner: sample
--
CREATE UNIQUE INDEX investigations_name_uindex ON public.investigations USING btree (name);

--
-- PostgreSQL database dump complete
--
