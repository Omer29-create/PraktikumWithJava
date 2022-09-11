package com.deneme.BosturDeneyebilirsin.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Creator {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gitdb", "postgres", "hr");
            System.out.println("Successfully Connected.");

            stmt = c.createStatement();

         /*stmt.execute("create table tbl_book (\n" +
                   "\tid SERIAL PRIMARY KEY,\n" +
                   "\twriter VARCHAR(50) NOT NULL,\n" +
                   "\tpublish_date DATE NOT NULL,\n" +
                   "\tpage_count INT NOT NULL,\n" +
                   "\tbook_version INT NOT NULL,\n" +
                   "\tis_epub_version_exist VARCHAR(50) NOT NULL\n" +
                   ");"
           );*/
            System.out.println("database  successfully created");

            String[] query = {
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Maudie Woolerton', '2022-08-01', 891, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Derron Booty', '2022-08-17', 747, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Gilemette Cassley', '2021-09-27', 432, 1, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Barthel Housiaux', '2022-06-23', 622, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Marcelline Alben', '2022-03-29', 134, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Dahlia Staddart', '2022-04-18', 690, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jeanie Ayars', '2022-03-04', 295, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Goldy Coltman', '2022-05-04', 874, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jeannie Glasby', '2022-01-10', 243, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Ella Petrina', '2022-04-12', 873, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Dannie Twining', '2021-09-15', 671, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Gui MacClancey', '2022-05-11', 956, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Adore Dibden', '2022-02-03', 948, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Gustave Omrod', '2021-09-12', 631, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Shea Jorez', '2021-11-01', 828, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Monte Rickerby', '2022-06-13', 916, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Florina Pahl', '2022-06-19', 350, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Bronson Vobes', '2022-01-17', 783, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Kaia Haddy', '2021-11-05', 541, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jesse Schellig', '2022-01-28', 194, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Luce Huggan', '2022-04-29', 650, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Verile Neale', '2022-02-20', 460, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Leoline Clemmitt', '2022-04-20', 720, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('April Attwater', '2021-12-11', 772, 1, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Beverie Toghill', '2022-02-02', 868, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Osmond Dyhouse', '2022-02-02', 636, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jermain Noakes', '2021-09-24', 274, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Leontyne Treneer', '2022-03-11', 596, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Edy Gerssam', '2021-10-31', 573, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Lorraine Belliard', '2021-09-13', 648, 3, false",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Miguel Ellwell', '2022-02-19', 513, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Gaby Beavers', '2022-06-17', 215, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Esmaria Chisnall', '2022-05-11', 158, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Hyacinthe Bumford', '2022-09-01', 936, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Joanie Cruxton', '2021-11-26', 692, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Sandi Cudd', '2022-02-20', 641, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Anabel Grasser', '2021-09-17', 442, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Mel Hancox', '2022-06-15', 650, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Katusha Woodhead', '2022-08-31', 679, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Bernita Khotler', '2021-11-18', 783, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Doris Neasham', '2021-09-21', 589, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Dieter Stonary', '2022-04-09', 411, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Cherin McLellan', '2021-09-19', 766, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Barbette Prudham', '2022-07-15', 232, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Graehme Pasquale', '2022-03-05', 686, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Hamil Fernandes', '2022-03-31', 426, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Augustine Town', '2022-07-17', 382, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Lexis Basso', '2021-11-05', 909, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Maddi Dunkerley', '2021-12-31', 471, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Brent Embury', '2022-07-31', 577, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Bourke Walsham', '2022-06-27', 808, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Giffy Whilde', '2021-09-07', 700, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Stanley Eisold', '2022-02-22', 540, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Agatha Pimblott', '2022-06-10', 691, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Randal Dockrell', '2022-03-29', 689, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Tilda Skydall', '2022-03-10', 395, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Janelle McKeeman', '2022-08-08', 149, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Eolande Proffer', '2022-06-12', 612, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Ward Leadstone', '2021-10-16', 847, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Celestyna Tuttle', '2021-10-09', 343, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Rebeka Baddow', '2022-05-15', 370, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Alard Clell', '2021-10-27', 191, 5, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Winslow Huzzey', '2021-11-06', 939, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Sydelle Watman', '2022-01-18', 788, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Mart Mumberson', '2021-09-05', 473, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jocelin Gisburne', '2022-01-15', 160, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Armando Mallard', '2022-08-05', 888, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Lawton Treacy', '2022-03-31', 412, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Myrtia Cowper', '2022-06-07', 835, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Tedda Middup', '2022-06-01', 731, 1, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Reeva Yushkin', '2021-11-21', 807, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Shena Benezeit', '2022-01-08', 769, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Nelly Cockton', '2021-10-13', 797, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Antonio Ogle', '2021-11-24', 690, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Hermione Richfield', '2021-10-22', 265, 2, true",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Fran Frenchum', '2022-03-14', 106, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Yelena Dorin', '2022-07-13', 530, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Angil Cardinale', '2022-01-29', 982, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Darill Grizard', '2021-09-23', 840, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Teodor Pavyer', '2022-05-10', 127, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Hadrian Nortcliffe', '2022-04-04', 619, 2, true",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Shelley Heinig', '2021-12-07', 116, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Maximilianus Lilywhite', '2022-01-02', 568, 4, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Christy Bickle', '2022-03-13', 513, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Lydon Ferns', '2022-07-17', 262, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Octavius James', '2022-06-02', 216, 1, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Garreth Augar', '2021-11-29', 953, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Mylo Vedyasov', '2021-11-16', 750, 1, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Kellen Aldersea', '2022-06-02', 104, 2, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Hanni Foggo', '2022-01-02', 359, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Eadmund Hellwing', '2022-07-01', 349, 3, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Nanon McGerr', '2022-05-06', 370, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Vladimir Meese', '2022-01-26', 103, 4, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Jeffie Allsop', '2021-12-29', 322, 2, true)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Wendeline Devanney', '2022-02-23', 440, 4, true",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Allianora Phettiplace', '2022-01-14', 208, 5, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Bab Cowburn', '2022-03-23', 966, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Buffy Beardmore', '2021-12-22', 863, 1, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Merwin Wanderschek', '2022-03-05', 402, 3, false)",
                    "insert into tbl_book (writer, publish_date, page_count, book_version, is_epub_version_exist) values ('Kimble Rawlinson', '2021-11-05', 255, 3, true)"};

            for (String s : query) {
                stmt.executeUpdate(s);
            }
            System.out.println("We added some informations to the our database.");

            stmt.close();
            c.close();
        } catch (Exception e) {

            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println(" Data Added Successfully ..");
    }
}

