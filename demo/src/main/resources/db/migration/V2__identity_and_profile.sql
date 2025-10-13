CREATE  TABLE account (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    email citext UNIQUE NOT NULL,
    password_hash text NOT NULL,
    status text NOT NULL DEFAULT 'active',
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now(),
    deleted_at timestamptz NULL
);
CREATE INDEX idx_account_status ON account(status);

CREATE  TYPE gender_enum AS ENUM('male', 'female', 'other');
CREATE  TABLE  profile (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    account_id uuid UNIQUE NOT NULL REFERENCES account(id) ON DELETE CASCADE,
    username citext UNIQUE NOT NULL,
    first_name text NOT NULL,
    last_name text NOT NULL,
    avatar_url text NULL,
    cover_url text NULL,
    gender  gender_enum NULL,
    birthday date NULL,
    location text NULL,
    created_at timestamptz NOT NULL DEFAULT now(),
    updated_at timestamptz NOT NULL DEFAULT now()
)