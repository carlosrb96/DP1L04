
    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `banner` 
       drop 
       foreign key `FKjoxwdnjr54soq3j89kt3fgrtj`;

    alter table `commercial_banner` 
       drop 
       foreign key FK_q9id3wc65gg49afc5tlr1c00n;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `non_commercial_banner` 
       drop 
       foreign key FK_2l8gpcwh19e7jj513or4r9dvb;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    alter table `sponsor` 
       drop 
       foreign key FK_20xk0ev32hlg96kqynl6laie2;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `authenticated`;

    drop table if exists `banner`;

    drop table if exists `briones_bulletin`;

    drop table if exists `challenge`;

    drop table if exists `commercial_banner`;

    drop table if exists `company_record`;

    drop table if exists `consumer`;

    drop table if exists `customization`;

    drop table if exists `garrido_bulletin`;

    drop table if exists `guerrero_bulletin`;

    drop table if exists `horrillo_bulletin`;

    drop table if exists `investor_record`;

    drop table if exists `lobato_bulletin`;

    drop table if exists `non_commercial_banner`;

    drop table if exists `offer`;

    drop table if exists `perez_bulletin`;

    drop table if exists `provider`;

    drop table if exists `request_`;

    drop table if exists `shout`;

    drop table if exists `sponsor`;

    drop table if exists `user_account`;

    drop table if exists `hibernate_sequence`;
