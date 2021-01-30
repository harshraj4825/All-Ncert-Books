package thezero.pkd.ncertbooksitoxii.MethodsHelper;
public class GetterSetter {
    private int classNumber;
    private String SubjectName,bookName;
    private String[] bookTitle,subList;
    public String[] classList=new String[]{"Select Class","Class-1","Class-2","Class-3","Class-4","Class-5","Class-6","Class-7","Class-8","Class-9","Class-10","Class-11","Class-12","Class-11 and 12 combined"};
    public int getClassNumber() {
        return classNumber;
    }

    public String getClassName() {
        return "Class-"+getClassNumber();
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getSubjectName() {
        return SubjectName;
    }
    public String getBookName() {
        return bookName;
    }

    public String[] getSubList() {
        switch(classNumber){
            case 1:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu"};
                break;
            case 2:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu"};
                break;
            case 3:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Environmental Studies"};
                break;
            case 4:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Environmental Studies"};
                break;
            case 5:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Environmental Studies"};
                break;
            case 6:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Sanskrit","Science","Social Science"};
                break;
            case 7:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Sanskrit","Science","Social Science"};
                break;
            case 8:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Sanskrit","Science","Social Science"};
                break;
            case 9:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Science","Social Science","Sanskrit","Health and Physical Education","Information and Communication Technology"};
                break;
            case 10:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Science","Social Science","Sanskrit","Health and Physical Education"};
                break;
            case 11:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Sanskrit","Health and Physical Education","Physics","Chemistry",
                        "Biology","Computer Science","Bio-Technology","Computers and Communication Technology","Informative Practices",
                        "History","Geography","Sociology","Psychology","Accountancy","Political Science","Business Studies","Graphic Design",
                        "Fine Art","Home Science","Economics","Heritage Crafts","Creative Writing and Technology"};
                break;
            case 12:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu","Sanskrit","Physics","Chemistry","Biology","Computer Science",
                        "History","Geography","Sociology","Psychology","Accountancy","Political Science","Business Studies","New Age Graphic Design",
                        "Fine Art","Home Science","Economics","Heritage Crafts","Creative Writing and Technology"};
                break;
            case 13:
                subList=new String[]{"Select Subject","Hindi","Sanskrit","Urdu","Heritage Crafts"};
                break;
            default:
                subList=new String[]{"Select Subject","Mathematics","English","Hindi","Urdu"};
                break;
        }
        return subList;
    }
//setting book title
    public String[] getBookTitles() {
        switch (classNumber){
            //class-1
            case 1:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo-I (Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Marigold","Raindrops"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Rimjhim"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Ibtedai Urdu-I"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo-I (Urdu)"};
                }
                break;
            //class-2
            case 2:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadu-II (Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Marigold","Raindrops"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Rimjhim-II"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Ibtedai Urdu-II"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadu-II (Urdu)"};
                }
                break;
            //class-3
            case 3:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo-III(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Marigold"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Rimjhim-III"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Ibtedai Urdu-III"};
                        break;
                    case "Environmental Studies":
                        bookTitle=new String[]{"Select Book","Looking Around","Aas-Pass","Aas-Pass(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit Ka Jaadu","Riyazi Ka Jadoo-III(Urdu)"};
                }
                break;
            //class-4
            case 4:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Marigold"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Rimjhim-IV"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Ibtedai Urdu IV"};
                        break;
                    case "Environmental Studies":
                        bookTitle=new String[]{"Select Book","Looking Around(EVS)","Aas-Paas","Aas-Paas(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo IV"};
                }
                break;
            //class-5
            case 5:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo (Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Marigold"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Rimjhim"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Ibtedai Urdu V"};
                        break;
                    case "Environmental Studies":
                        bookTitle=new String[]{"Select Book","Looking Around","Aas-Pass","Aas-Pass(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo(Urdu)"};
                }
                break;
            //class-6
            case 6:
                switch (SubjectName){
                    case "Mathematics":
                    bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
                    break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Honeysuckle","A Pact With The Sun"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Vasant","Durva","Bal Ram Katha"};
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Apni Zuban VI","Urdu Guldasta","Jaan Pahechan"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Ruchira"};
                        break;
                    case "Science":
                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
                        break;
                    case "Social Science":
                        bookTitle=new String[]{"Select Book","History-Our Past","The Earth Our Habita","Hamare Ateet","Social And Political Life","Samajik Evem Rajnitik Jeevan","Prithavi Hamara Avas (Bhugol)","Hamare Maazi(Urdu)"
                                ,"Zameen Hamara Maskan(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
                }
                break;
            //class-7
            case 7:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Honeycomb","An alien Hand Supplementry Reader"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Vasant","Durva","Mahabharat"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Apni Zuban","Urdu Guldasta","Door-Pass"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Ruchira"};
                        break;
                    case "Science":
                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
                        break;
                    case "Social Science":
                        bookTitle=new String[]{"Select Book","Our Pasts-II","Our Environment","Hamara Paryavaran","Hamare Ateet-II","Social And Political Life","Samajik Evem Rajnitik Jeevan","Hamare Maazi(Urdu)"
                                ,"Hamare Mahol(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
                }
                break;
            //class-8
            case 8:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Honeydew","It So Happend"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Vasant","Durva","Bharat Ki Khoj","Sanshipt Budhcharit"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Apni Zuban","Urdu Guldasta","Door-Pass","Jaan Pahechan"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Ruchira"};
                        break;
                    case "Science":
                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
                        break;
                    case "Social Science":
                        bookTitle=new String[]{"Select Book","Our Past-III","Resource and Development(Geography)","Sansadhan Avam Vikas(Bhugol)","Hamare Ateet-III","Social And Political Life","Samajik Evem Rajnitik Jeevan","Hamare Maazi(Urdu)"
                                ,"Geography(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                }
                break;
            //class-9
            case 9:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Words and Expressions-I","Beehive English Text Book","Moments Supplimentary Reader"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Kshitij-I(Hindi)","Sprash-I","Kritika-I","Sanchayan-I"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Gulzare-e-urdu","Nawa-e-urdu","Door Pass","Jaan Pahechan","Sab Rang","Ansaf-e-Urdu Adab"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Shemushi","Vyakaranavithi","Abhyaswaan Bhav"};
                        break;
                    case "Science":
                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
                        break;
                    case "Social Science":
                        bookTitle=new String[]{"Select Book","Democratic Politics","Loktantric Rajniti","Contemporary India","Samkalin Bharat",
                                "Arthashastra","Economics","India and the Contempoarary World-1","Bharat Aur Samkalin Vishwa-1","Geographia(Urdu)",
                                "Jamhuri Syasat(Urdu)","Hindustan Aur Asri Dunia-I(Urdu)","Aasri Hindustan","Mashiyat"};
                        break;
                    case "Health and Physical Education":
                        bookTitle=new String[]{"Select Book","Health and Physical Education"};
                        break;
                    case "Information and Communication Technology":
                        bookTitle=new String[]{"Select Book","Information and Communication Technology"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                }
                break;
            case 10:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Words and Expressions-II","First Flight","Foot Prints Without feet Supp. Reader"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Kshitij(Hindi)-II","Sprash-II","Kritika-II","Sanchayan-II"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Gulzare-e-urdu","Nawa-e-urdu","Door Pass","Jaan Pahechan","Sab Rang"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Shemushi-II","Vyakaranavithi-II","Abhyaswaan-II"};
                        break;
                    case "Science":
                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
                        break;
                    case "Social Science":
                        bookTitle=new String[]{"Select Book","Democratic Politics","Loktantric Rajniti","Understanding Economic Development","Contemporary India","Samkalin Bharat",
                                "Arthic Vikas Li Samajh","Maashi Taraqqui Ki Samajh","India and the Contempoarary World-II","Bharat Aur Samkalin Vishwa-II",
                                "Jamhuri Syasat-II(Urdu)","Hindustan Aur Asri Dunia-II(Urdu)","Aasri Hindustan-II"};
                        break;
                    case "Health and Physical Education":
                        bookTitle=new String[]{"Select Book","Health and Physical Education"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
                }
                break;


            case 11:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi-I(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Woven Words","Hornbill","Snapshots Suppl. Reader"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Antra","Aroh","Vitan","Antral"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Nai Awaz","Dhanak","Gulistan-e Adab","Khyabane Urdu"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Bhaswati","Shashwati"};
                        break;
                    case "Health and Physical Education":
                        bookTitle=new String[]{"Select Book","health and Physical Education"};
                        break;
                    case "Physics":
                        bookTitle=new String[]{"Select Book","Bhautiki-I","Bhautiki-II","Physics-I","Physics-II","Tabiyaat-I","Tabiyaat-II"};
                        break;
                    case "Chemistry":
                        bookTitle=new String[]{"Select Book","Chemistry-I","Chemistry-II","Rasayan Vigyan-1","Rasayan Vigyan-II","Keemiya-I","Keemiya-II"};
                        break;
                    case "Biology":
                        bookTitle=new String[]{"Select Book","Biology","Jeev Vigyan","Hayatiyaat"};
                        break;
                    case "Computer Science":
                        bookTitle=new String[]{"Select Book","Computer Science"};
                        break;
                    case "Bio-Technology":
                        bookTitle=new String[]{"Select Book","Bio-Technology"};
                        break;
                    case "Computers and Communication Technology":
                        bookTitle=new String[]{"Select Book","CCT-I","CCT-II","Computer aur Sanchar Prodhogiki-I","Computer aur Sanchar Prodhogiki-II","Computer Aur Muwaslati Technology-I","Computer Aur Muwaslati Technology-II"};
                        break;
                    case "Informative Practices":
                        bookTitle=new String[]{"Select Book","Informatics Practices"};
                        break;
                    case "Fine Art":
                        bookTitle=new String[]{"Select Book","An Introduction to Indian Art-I","Bhartiya Kala Ka parichay"};
                        break;
                    case "History":
                        bookTitle=new String[]{"Select Book","Themes in World History","Vishwa Itihas Ke Kuch Vishay","Tareekh-e-Alam per Mabni Mauzuaat-I"};
                        break;
                    case "Sociology":
                        bookTitle=new String[]{"Select Book","Introduction Sociology","Samajshastra-I","Samajiyaat Ka Tarf","Understanding Society","Samaj ka Bodh","Mutala-e-Muashira"};
                        break;
                    case "Psychology":
                        bookTitle=new String[]{"Select Book","Introduction to Psychology","Manovigyan","Nafsiyaat"};
                        break;
                    case "Accountancy":
                        bookTitle=new String[]{"Select Book","Accounting-I","Accounting-II","Lekhashastra-I","Lekhashastra-II","Khatadari-I(Urdu)","Khatadari-II(Urdu)"};
                        break;
                    case "Geography":
                        bookTitle=new String[]{"Select Book","Fundamental of Physical Geography","Political Work in Geography","India Physical Environment","Bhautique Bhugol ke Mool Sidhant","Tabai Gugraphiya ke Mubadiyat",
                                "Hindustan Tabiee Mahol(Urdu)","Geographia mein amli kaam(Urdu)","Bhugol main Prayogatmak Karya","Bhart Bhautik Paryabaran","Jughrafia Mein Aamli Kam","Geographiya Ke Mubadiyat"};
                        break;
                    case "Political Science":
                        bookTitle=new String[]{"Select Book","Political Theory","Raajneeti Sidhant","Hindustani Aain aur Kaam","Indian Economic Development(Urdu)","India Constitution at Work","Bharat ka Samvidhan Sidhant aur Vyavhar","Siyasi Nazaria"};
                        break;
                    case "Business Studies":
                        bookTitle=new String[]{"Select Book","Business Studies","Vyavsay Adhyanan","Karobari Uloom-I"};
                        break;
                    case "Graphic Design":
                        bookTitle=new String[]{"Select Book","The story of graphic design","Graphic Design ek Kahani"};
                        break;
                    case "Home Science":
                        bookTitle=new String[]{"Select Book","Human Ecology and Family Sciences-I","Human Ecology and Family Sciences-II","Manav Paristhitiki evm pariwar vigyan-I","Manav Paristhitiki evm pariwar vigyan-II","Insani Mahauliyat aur Uloom e Khandandari-I","Insani Mahauliyat aur Uloom e Khandandari-II"};
                        break;
                    case "Economics":
                        bookTitle=new String[]{"Select Book","Indian Economic Development","Statistics for Economics","Sankhyiki","Bhartiya Airthryavstha Ka Vikas","Hindustan Ki Moaashi Tarraqqi(Urdu)","Shumariyaat Bar-e-Mushiyat(Urdu)"};
//                        bookTitle=new String[]{"Select Book","Introductory Microeconomics","Introductory Macroeconomics","Vyashthi Arthshasrta","Samashty Arthshastra Ek Parichay","Juzvi Maashiyat ka Taruf(Urdu)","Kulli Maashiyat Ka Taruf(Urdu)"};
                        break;
                    case "Heritage Crafts":
                        bookTitle=new String[]{"Select Book","Living Craft Traditions of India","Hindustan me Dastkari Ki Riwayat","Dastkari"};
                        break;
                    case "Creative Writing and Technology":
                        bookTitle=new String[]{"Select Book","Srijan","Takhleequi Jauhar"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};

                }
                break;
            case 12:
                switch (SubjectName){
                    case "Mathematics":
                        bookTitle=new String[]{"Select Book","Mathematics-I","Mathematics-II","Ganit-I","Ganit-II","Riyazi-I(Urdu)","Riyazi-II(Urdu)"};
                        break;
                    case "English":
                        bookTitle=new String[]{"Select Book","Kaliedoscope","Flamingo","Vistas"};
                        break;
                    case "Hindi":
                        bookTitle=new String[]{"Select Book","Antra","Aroh","Vitan","Antral-II"};
                        break;
                    case "Urdu":
                        bookTitle=new String[]{"Select Book","Nai Awaz","Dhanak","Gulistan-e Adab","Khyaban-e Urdu"};
                        break;
                    case "Sanskrit":
                        bookTitle=new String[]{"Select Book","Bhaswati","Shashwati"};
                        break;
                    case "Physics":
                        bookTitle=new String[]{"Select Book","Bhautiki-I","Bhautiki-II","Physics-I","Physics-II","Tabiyaat-I","Tabiyaat-II"};
                        break;
                    case "Chemistry":
                        bookTitle=new String[]{"Select Book","Chemistry-I","Chemistry-II","Rasayan Vigyan-1","Rasayan Vigyan-II","Keemiya-I","Keemiya-II"};
                        break;
                    case "Biology":
                        bookTitle=new String[]{"Select Book","Biology","Jeev Vigyan","Hayatiyaat","Human Ecology andd Family Science"};
                        break;
                    case "Computer Science":
                        bookTitle=new String[]{"Select Book","Computer Science"};
                        break;
                    case "Fine Art":
                        bookTitle=new String[]{"Select Book","An Introduction to Indian Art-II"};
                        break;
                    case "History":
                        bookTitle=new String[]{"Select Book","Themes in Indian History-I","Themes in Indian History-II","Themes in Indian History-III","Bharatiya Itihas Ke Kuch Vishay-I","Bharatiya Itihas Ke Kuch Vishay-II","Bharatiya Itihas Ke Kuch Vishay-III","Tareekh-e-hind ke Mauzuaat-I","Tareekh-e-hind ke Mauzuaat-II","Tareekh-e-hind ke Mauzuaat-III"};
                        break;
                    case "Sociology":
                        bookTitle=new String[]{"Select Book","Indian Society","Bhartiya Samaj","Social Change and Development in India","Bharat main Samajik Parivartan aur Vikas","Hindustani Samaj(Urdu)","Hindustan Mein Samaji Tabdili Aur Taraqqi(Urdu)"};
                        break;
                    case "Psychology":
                        bookTitle=new String[]{"Select Book","Psychology","Manovigyan","Nafsiyaat"};
                        break;
                    case "Accountancy":
                        bookTitle=new String[]{"Select Book","Accounting-I","Accounting-II","Lekhashastra-I","Lekhashastra-II","Khatadari-I","Khatadari-II","Computerised Accounting System"};
                        break;
                    case "Political Science":
                        bookTitle=new String[]{"Select Book","Political Science-II","Swatantra Bharat Mein Rajniti-II","Contemporary World Politics","Samkalin Vishwa Rajniti","Aasri Alami Siyasat(Urdu)","Azadi Ke Baad Hindustan Ki Siyasat(Urdu)"};
                        break;
                    case "Business Studies":
                        bookTitle=new String[]{"Select Book","Business Studies-I","Business Studies-II","Vyavsay Adhyanan-I","Vyavsay Adhyanan-II","Karobari Uloom-I","Karobari Uloom-II"};
                        break;
                    case "Graphic Design":
                        bookTitle=new String[]{"Select Book","New Age of graphic design"};
                        break;
                    case "Home Science":
                        bookTitle=new String[]{"Select Book","Human Ecology and Family Sciences-I","Human Ecology and Family Sciences-II","Manav Paristhitiki evm pariwar vigyan-I","Manav Paristhitiki evm pariwar vigyan-II"};
                        break;
                    case "Economics":
                        bookTitle=new String[]{"Select Book","Introductory Microeconomics","Introductory Macroeconomics","Vyashthi Arthshasrta","Samashty Arthshastra Ek Parichay","Juzvi Maashiyat ka Taruf(Urdu)","Kulli Maashiyat Ka Taruf(Urdu)"};
//                        bookTitle=new String[]{"Select Book","Indian Economic Development","Statistics for Economics","Sankhyiki","Bhartiya Airthryavstha Ka Vikas","Hindustan Ki Moaashi Tarraqqi(Urdu)","Shumariyaat Bar-e-Mushiyat(Urdu)"};
                        break;
                    case "Heritage Crafts":
                        bookTitle=new String[]{"Select Book","Bharatiya Hastkla Ki Paramparayen","Hindustan me Dastkari Ki Riwayat","Craft Tradition of India"};
                        break;
                    case "Creative Writing and Technology":
                        bookTitle=new String[]{"Select Book","Takhleequi Jauhar"};
                        break;
                    default:
                        bookTitle=new String[]{"Select Book","Mathematics-I","Mathematics-II","Ganit-I","Ganit-II","Riyazi-I(Urdu)","Riyazi-II(Urdu)"};

                }
                break;
            case 13:
               switch (SubjectName){
                   case "Hindi":
                       bookTitle=new String[]{"Select Book","Abhivyakti Aur Madhyam"};
                       break;
                   case "Urdu":
                       bookTitle=new String[]{"Select Book","Zuban-O-Adab ki Tareekh","Urdu Qwaid aur Insha"};
                       break;
                   case "Sanskrit":
                       bookTitle=new String[]{"Select Book","Sanskrit Sahitya parichay"};
                       break;
                   case "Heritage Crafts":
                       bookTitle=new String[]{"Select Book","Exploring Craft Tradition of India","Bhartiya Hastkala Parmparaon ki Khoj"};
                       break;
                   default:
                       bookTitle=new String[]{"Select Book","Abhivyakti Aur Madhyam"};
               }
                break;
            default:
                bookTitle=new String[]{"Select Book","Math-Magic","Ganit Ka Jaadu","Riyazi Ka Jadoo"};
        }
        return bookTitle;
    }
//    GetChapterList
//    public String[] getChapterList(){
//        switch (classNumber){
//            //class-1
//            case 1:
//                switch (SubjectName){
//                    case "Mathematics":
//                        switch (bookName){
//                            case "Math-Magic":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Teacher's Note"};
//                                break;
//                            case "Ganit Ka Jaadu":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Teacher's Note"};                                break;
//                            case "Riyazi Ka Jadoo-I (Urdu)":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Teacher's Note"};
//                                break;
//                        }
//                        break;
//                    case "English":
//                        switch (bookName){
//                            case "Marigold":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10"};
//                                break;
//                            case "Raindrops":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19"};
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        if(bookName.equals("Rimjhim")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                    "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23"};
//                        }
//                        break;
//                    case "Urdu":
//                        if(bookName.equals("Ibtedai Urdu-I")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                    "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23","Chapter-24",
//                                    "Chapter-25","Chapter-26","Chapter-27"};
//                        }
//                        break;
//                }
//                break;
//            //class-2
//            case 2:
//                switch (SubjectName){
//                    case "Mathematics":
//                        switch (bookName){
//                            case "Math-Magic":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15"};
//                                break;
//                            case "Ganit Ka Jaadu":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15"};                                break;
//                            case "Riyazi Ka Jadoo-II (Urdu)":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15"};
//                                break;
//                        }
//                        break;
//                    case "English":
//                        switch (bookName){
//                            case "Marigold":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10"};
//                                break;
//                            case "Raindrops":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15"};
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        if(bookName.equals("Rimjhim-II")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15"};
//                        }
//                        break;
//                    case "Urdu":
//                        if(bookName.equals("Ibtedai Urdu-II")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                    "Chapter-17","Chapter-18","Chapter-19","Chapter-20"};
//                        }
//                        break;
//                }
//                break;
//            //class-3
//            case 3:
//                switch (SubjectName){
//                    case "Mathematics":
//                        switch (bookName){
//                            case "Math-Magic":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14"};
//                                break;
//                            case "Ganit Ka Jaadu":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14"};
//                                break;
//                            case "Riyazi Ka Jadoo-III (Urdu)":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14"};
//                                break;
//                        }
//                        break;
//                    case "English":
//                        if(bookName.equals("Marigold")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10"};
//                        }
//                        break;
//                    case "Hindi":
//                        if(bookName.equals("Rimjhim-III")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14"};
//                        }
//                        break;
//                    case "Urdu":
//                        if(bookName.equals("Ibtedai Urdu-III")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                    "Chapter-17","Chapter-18","Chapter-19","Chapter-20"};
//                        }
//                        break;
//                    case "Environmental Studies":
//                        bookTitle=new String[]{"Select Book","Looking Around","Aas-Pass","Aas-Pass(Urdu)"};
//                        switch (bookName){
//                            case "Looking Around":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23","Chapter-24"};
//                                break;
//                            case "Aas-Pass":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23","Chapter-24"};
//                                break;
//                            case "Aas-Pass(Urdu)":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23","Chapter-24"};
//                                break;
//                        }
//                        break;
//                }
//                break;
//            //class-4
//            case 4:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi Ka Jadoo"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Riyazi Ka Jadoo":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Marigold"};
//                        switch (bookName){
//                            case "Marigold":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Rimjhim"};
//                        switch (bookName){
//                            case "Rimjhim":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Rimjhim"};
//                        switch (bookName){
//                            case "Ibtedai Urdu IV":
//                                break;
//                        }
//                        break;
//                    case "Environmental Studies":
//                        bookTitle=new String[]{"Select Book","Looking Around","Aas-Pass","Aas-Pass(Urdu)"};
//                        switch (bookName){
//                            case "Looking Around":
//                                break;
//                            case "Aas-Pass":
//                                break;
//                            case "Aas-Pass(Urdu)":
//                                break;
//                        }
//                        break;
//                }
//                break;
//            //class-5
//            case 5:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi Ka Jadoo"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Riyazi Ka Jadoo":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Marigold"};
//                        switch (bookName){
//                            case "Marigold":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Rimjhim"};
//                        switch (bookName){
//                            case "Rimjhim":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Rimjhim"};
//                        switch (bookName){
//                            case "Rimjhim":
//                                break;
//                        }
//                        break;
//                    case "Environmental Studies":
//                        bookTitle=new String[]{"Select Book","Looking Around","Aas-Pass","Aas-Pass(Urdu)"};
//                        switch (bookName){
//                            case "Looking Around":
//                                break;
//                            case "Aas-Pass":
//                                break;
//                            case "Aas-Pass(Urdu)":
//                                break;
//                        }
//                        break;
//                }
//                break;
//            //class-6
//            case 6:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Hisab(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Honeysuckle","A Pact With The Sun"};
//                        switch (bookName){
//                            case "Honeysuckle":
//                                break;
//                            case "A Pact With The Sun":
//                                break;
//                        }
//
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Vasant","Durva","Bal Ram Katha"};
//                        switch (bookName){
//                            case "Vasant":
//                                break;
//                            case "Durva":
//                                break;
//                            case "Bal Ram Katha":
//                                break;
//                        }
//
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Apni Zuban","Urdu Guldasta","Jaan Pahechan"};
//                        switch (bookName){
//                            case "Apni Zuban":
//                                break;
//                            case "Urdu Guldasta":
//                                break;
//                            case "Jaan Pahechan":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Ruchira"};
//                        switch (bookName){
//                            case "Ruchira":
//                                break;
//                        }
//
//                        break;
//                    case "Science":
//                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
//                        switch (bookName){
//                            case "Vigyan":
//                                break;
//                            case "Science":
//                                break;
//                            case "Science(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Social Science":
//                        bookTitle=new String[]{"Select Book","History-Our Past","The Earth Our Habita","Hamare Ateet","Social And Political Life","Samajik Evem Rajnitik Jeevan","Prithavi Hamara Avas (Bhugol)","Hamare Maazi(Urdu)"
//                                ,"Zameen Hamara Maskan(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
//                        switch (bookName){
//                            case "History-Our Past":
//                                break;
//                            case "The Earth Our Habita":
//                                break;
//                            case "Hamare Ateet":
//                                break;
//                            case "Social And Political Life":
//                                break;
//                            case "Samajik Evem Rajnitik Jeevan":
//                                break;
//                            case "Prithavi Hamara Avas (Bhugol)":
//                                break;
//                            case "Hamare Maazi(Urdu)":
//                                break;
//                            case "Zameen Hamara Maskan(Urdu)":
//                                break;
//                            case "Samazi Aur Siyasi Zindagi(Urdu)":
//                                break;
//                        }
//                        break;
//                }
//                break;
//            //class-7
//            case 7:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Hisab(Urdu)":
//                                break;
//                        }
//
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Honeycomb","An alien Hand Supplementry Reader"};
//                        switch (bookName){
//                            case "Honeycomb":
//                                break;
//                            case "An alien Hand Supplementry Reader":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Vasant","Durva","Mahabharat"};
//                        switch (bookName){
//                            case "Vasant":
//                                break;
//                            case "Durva":
//                                break;
//                            case "Mahabharat":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Apni Zuban","Urdu Guldasta","Door-Pass"};
//                        switch (bookName){
//                            case "Apni Zuban":
//                                break;
//                            case "Urdu Guldasta":
//                                break;
//                            case "Door-Pass":
//                                break;
//                        }
//
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Ruchira"};
//                        switch (bookName){
//                            case "Ruchira":
//                                break;
//                        }
//                        break;
//                    case "Science":
//                        switch (bookName){
//                            case "Vigyan":
//                                break;
//                            case "Science":
//                                break;
//                            case "Science(Urdu)":
//                                break;
//                        }                        break;
//                    case "Social Science":
//                        bookTitle=new String[]{"Select Book","Our Past-II","Our Environment","Hamara Paryavaran","Hamare Ateet-II","Social And Political Life","Samajik Evem Rajnitik Jeevan","Hamare Maazi(Urdu)"
//                                ,"Hamare Mahol(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
//                        break;
//                }
//                break;
//            //class-8
//            case 8:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Hisab(Urdu)"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Hisab(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Honeydew","It So Happend"};
//                        switch (bookName){
//                            case "Honeydew":
//                                break;
//                            case "It So Happend":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Vasant","Durva","Bharat Ki Khoj","Sanshipt Budhcharit"};
//                        switch (bookName){
//                            case "Vasant":
//                                break;
//                            case "Durva":
//                                break;
//                            case "Bharat Ki Khoj":
//                                break;
//                            case "Sanshipt Budhcharit":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Apni Zuban","Urdu Guldasta","Door-Pass","Jaan Pahechan"};
//                        switch (bookName){
//                            case "Apni Zuban":
//                                break;
//                            case "Urdu Guldasta":
//                                break;
//                            case "Door-Pass":
//                                break;
//                            case "Jaan Pahechan":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Ruchira"};
//                        switch (bookName){
//                            case "Ruchira":
//                                break;
//                        }
//                        break;
//                    case "Science":
//                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
//                        switch (bookName){
//                            case "Vigyan":
//                                break;
//                            case "Science":
//                                break;
//                            case "Science(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Social Science":
//                        bookTitle=new String[]{"Select Book","Our Past-III","Resource and Development(Geography)","Sansadhan Avam Vikas(Bhugol)","Hamare Ateet-III","Social And Political Life","Samajik Evem Rajnitik Jeevan","Hamare Maazi(Urdu)"
//                                ,"Geography(Urdu)","Samazi Aur Siyasi Zindagi(Urdu)"};
//                        switch (bookName){
//                            case "Our Past-III":
//                                break;
//                            case "Resource and Development(Geography)":
//                                break;
//                            case "Sansadhan Avam Vikas(Bhugol)":
//                                break;
//                            case "Hamare Ateet-III":
//                                break;
//                            case "Social And Political Life":
//                                break;
//                            case "Samajik Evem Rajnitik Jeevan":
//                                break;
//                            case "Hamare Maazi(Urdu)":
//                                break;
//                            case "Geography(Urdu)":
//                                break;
//                            case "Samazi Aur Siyasi Zindagi(Urdu)":
//                                break;
//                        }
//                        break;
//                }
//                break;
//            //class-9
//            case 9:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
//                        switch (bookName){
//                            case "Math-Magic":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Hisab(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Words and Expressions-I","Beehive English Text Book","Moments Supplimentary Reader"};
//                        switch (bookName){
//                            case "Words and Expressions-I":
//                                break;
//                            case "Beehive English Text Book":
//                                break;
//                            case "Moments Supplimentary Reader":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Kshitij(Hindi)","Sprash","Kritika","Sanchayan"};
//                        switch (bookName){
//                            case "Kshitij(Hindi)":
//                                break;
//                            case "Sprash":
//                                break;
//                            case "Sanchayan":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Gulzare-e-urdu","Nawa-e-urdu","Door Pass","Jaan Pahechan","Sab Rang","Ansaf-e-Urdu Adab"};
//                        switch (bookName){
//                            case "Gulzare-e-urdu":
//                                break;
//                            case "Nawa-e-urdu":
//                                break;
//                            case "Door Pass":
//                                break;
//                            case "Jaan Pahechan":
//                                break;
//                            case "Sab Rang":
//                                break;
//                            case"Ansaf-e-Urdu Adab":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Shemushi","Vyakaranavithi","Abhyaswaan Bhav"};
//                        switch (bookName){
//                            case "Shemushi":
//                                break;
//                            case "Vyakaranavithi":
//                                break;
//                            case "Abhyaswaan Bhav":
//                                break;
//                        }
//                        break;
//                    case "Science":
//                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
//                        switch (bookName){
//                            case "Vigyan":
//                                break;
//                            case "Science":
//                                break;
//                            case "Science(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Social Science":
//                        bookTitle=new String[]{"Select Book","Democratic Politics","Loktantric Rajniti","Contemporary India","Samkalin Bharat",
//                                "Arthashastra","Economics","India and the Contempoarary World-1","Bharat Aur Samkalin Vishwa-1","Geographia(Urdu)",
//                                "Jamhuri Syasat(Urdu)","Hindustan Aur Asri Dunia-I(Urdu)","Aasri Hindustan","Mashiyat"};
//                        switch (bookName){
//                            case "Democratic Politics":
//                                break;
//                            case "Loktantric Rajniti":
//                                break;
//                            case "Contemporary India":
//                                break;
//                            case "Samkalin Bharat":
//                                break;
//                            case "Arthashastra":
//                                break;
//                            case "Economics":
//                                break;
//                            case "India and the Contempoarary World-1":
//                                break;
//                            case "Bharat Aur Samkalin Vishwa-1":
//                                break;
//                            case "Geographia(Urdu)":
//                                break;
//                            case "Jamhuri Syasat(Urdu)":
//                                break;
//                            case "Hindustan Aur Asri Dunia-I(Urdu)":
//                                break;
//                            case "Aasri Hindustan":
//                                break;
//                            case"Mashiyat":
//                                break;
//                        }
//                        break;
//                    case "Health and Physical Education":
//                        bookTitle=new String[]{"Select Book","Health and Physical Education"};
//                        switch (bookName){
//                            case "Health and Physical Education":
//                                break;
//                        }
//                        break;
//                    case "Information and Communication Technology":
//                        bookTitle=new String[]{"Select Book","Information and Communication Technology"};
//                        switch (bookName){
//                            case "Information and Communication Technology":
//                                break;
//                        }
//                        break;
//                }
//                break;
//            case 10:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
//                        switch (bookName){
//                            case "Mathematics":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Riyazi(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Words and Expressions-II","First Flight","Foot Prints Without feet Supp. Reader"};
//                        switch (bookName){
//                            case "Words and Expressions-II":
//                                break;
//                            case "First Flight":
//                                break;
//                            case "Foot Prints Without feet Supp. Reader":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Kshitij(Hindi)","Sprash","Kritika","Sanchayan"};
//                        switch (bookName){
//                            case "Kshitij(Hindi)":
//                                break;
//                            case "Sprash":
//                                break;
//                            case "Kritika":
//                                break;
//                            case "Sanchayan":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Gulzare-e-urdu","Nawa-e-urdu","Door Pass","Jaan Pahechan","Sab Rang"};
//                        switch (bookName){
//                            case "Gulzare-e-urdu":
//                                break;
//                            case "Nawa-e-urdu":
//                                break;
//                            case "Door Pass":
//                                break;
//                            case "Jaan Pahechan":
//                                break;
//                            case "Sab Rang":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Shemushi","Vyakaranavithi","Abhyaswaan Bhav"};
//                        switch (bookName){
//                            case "Shemushi":
//                                break;
//                            case "Vyakaranavithi":
//                                break;
//                            case "Abhyaswaan Bhav":
//                                break;
//                        }
//                        break;
//                    case "Science":
//                        bookTitle=new String[]{"Select Book","Vigyan","Science","Science(Urdu)"};
//                        switch (bookName){
//                            case "Vigyan":
//                                break;
//                            case "Science":
//                                break;
//                            case "Science(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Social Science":
//                        bookTitle=new String[]{"Select Book","Democratic Politics","Loktantric Rajniti","Understanding Economic Development","Contemporary India","Samkalin Bharat",
//                                "Arthic Vikas Li Samajh","Maashi Taraqqui Ki Samajh","India and the Contempoarary World-II","Bharat Aur Samkalin Vishwa-II",
//                                "Jamhuri Syasat-II(Urdu)","Hindustan Aur Asri Dunia-II(Urdu)","Aasri Hindustan-II"};
//                        switch (bookName){
//                            case "Democratic Politics":
//                                break;
//                            case "Loktantric Rajniti":
//                                break;
//                            case "Understanding Economic Development":
//                                break;
//                            case "Contemporary India":
//                                break;
//                            case "Samkalin Bharat":
//                                break;
//                            case "Arthic Vikas Li Samajh":
//                                break;
//                            case "Maashi Taraqqui Ki Samajh":
//                                break;
//                            case "India and the Contempoarary World-II":
//                                break;
//                            case "Bharat Aur Samkalin Vishwa-II":
//                                break;
//                            case "Jamhuri Syasat-II(Urdu)":
//                                break;
//                            case "Hindustan Aur Asri Dunia-II(Urdu)":
//                                break;
//                            case "Aasri Hindustan-II":
//                                break;
//                        }
//                        break;
//                    case "Health and Physical Education":
//                        if (bookName.equals("Health and Physical Education")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13"};
//                        }
//                        break;
//                }
//                break;
//            case 11:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics","Ganit","Riyazi(Urdu)"};
//                        switch (bookName){
//                            case "Mathematics":
//                                break;
//                            case "Ganit":
//                                break;
//                            case "Riyazi(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Wovem Words","Hornbill","Snapshots Suppl. Reader"};
//                        switch (bookName){
//                            case "Wovem Words":
//                                break;
//                            case "Hornbill":
//                                break;
//                            case "Snapshots Suppl. Reader":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Antra","Aroh","Vitan","Antral"};
//                        switch (bookName){
//                            case "Antra":
//                                break;
//                            case "Aroh":
//                                break;
//                            case "Vitan":
//                                break;
//                            case "Antral":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Nai Awaz","Dhanak","Gulistan-e Adab","Khyaban-e Urdu"};
//                        switch (bookName){
//                            case "Nai Awaz":
//                                break;
//                            case "Dhanak":
//                                break;
//                            case "Gulistan-e Adab":
//                                break;
//                            case "Khyaban-e Urdu":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Bhaswati","Shashwati"};
//                        switch (bookName){
//                            case "Bhaswati":
//                                break;
//                            case "Shashwati":
//                                break;
//                        }
//                        break;
//                    case "Health and Physical Education":
//                        bookTitle=new String[]{"Select Book","health and Physical Education"};
//                        switch (bookName){
//                            case "health and Physical Education":
//                                break;
//                        }
//                        if (bookName.equals("health and Physical Education")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13"};
//                        }
//                        break;
//                    case "Physics":
//                        bookTitle=new String[]{"Select Book","Bhautiki-I","Bhautiki-II","Physics-I","Physics-II","Tabiyaat-I","Tabiyaat-II"};
//                        switch (bookName){
//                            case "Bhautiki-I":
//                                break;
//                            case "Bhautiki-II":
//                                break;
//                            case "Physics-I":
//                                break;
//                            case "Physics-II":
//                                break;
//                            case "Tabiyaat-I":
//                                break;
//                            case "Tabiyaat-II":
//                                break;
//                        }
//                        break;
//                    case "Chemistry":
//                        bookTitle=new String[]{"Select Book","Chemistry-I","Chemistry-II","Rasayan Vigyan-1","Rasayan Vigyan-II","Keemiya-I","Keemiya-II"};
//                        switch (bookName){
//                            case "Chemistry-I":
//                                break;
//                            case "Chemistry-II":
//                                break;
//                            case "Rasayan Vigyan-I":
//                                break;
//                            case "Rasayan Vigyan-II":
//                                break;
//                            case "Keemiya-I":
//                                break;
//                            case "Keemiya-II":
//                                break;
//                        }
//                        break;
//                    case "Biology":
//                        bookTitle=new String[]{"Select Book","Biology","Jeev Vigyan","Hayatiyaat"};
//                        switch (bookName){
//                            case "Biology":
//                                break;
//                            case "Jeev Vigyan":
//                                break;
//                            case "Hayatiyaat":
//                                break;
//                        }
//                        break;
//                    case "Computer Science":
//                        bookTitle=new String[]{"Select Book","Computer Science"};
//                        switch (bookName){
//                            case "Computer Science":
//                                break;
//                        }
//                        break;
//                    case "Bio-Technology":
//                        bookTitle=new String[]{"Select Book","Bio-Technology"};
//                        switch (bookName){
//                            case "Bio-Technology":
//                                break;
//                        }
//                        break;
//                    case "Computers and Communication Technology":
//                        bookTitle=new String[]{"Select Book","CCT-I","CCT-II","Computer aur Sanchar Prodhogiki-I","Computer aur Sanchar Prodhogiki-II","Computer Aur Muwaslati Technology-I","Computer Aur Muwaslati Technology-II"};
//                        switch (bookName){
//                            case "CCT-I":
//                                break;
//                            case "CCT-II":
//                                break;
//                            case "Computer aur Sanchar Prodhogiki-I":
//                                break;
//                            case "Computer aur Sanchar Prodhogiki-II":
//                                break;
//                            case "Computer Aur Muwaslati Technology-I":
//                                break;
//                            case "Computer Aur Muwaslati Technology-II":
//                                break;
//                        }
//                        break;
//                    case "Informative Practices":
//                        bookTitle=new String[]{"Select Book","Informatics Practices"};
//                        switch (bookName){
//                            case "Informatics Practices":
//                                break;
//                        }
//                        break;
//                    case "Fine Art":
//                        bookTitle=new String[]{"Select Book","An Introduction to Indian Art-I","Bhartiya Kala Ka parichay"};
//                        switch (bookName){
//                            case "An Introduction to Indian Art-I":
//                                break;
//                            case "Bhartiya Kala Ka parichay":
//                                break;
//                        }
//                        break;
//                    case "History":
//                        bookTitle=new String[]{"Select Book","Themes in World History","Vishwa Itihas Ke Kuch Vishay","Tareekh-e-Alam per Mabni Mauzuaat-I"};
//                        switch (bookName){
//                            case "Themes in World History":
//                                break;
//                            case "Vishwa Itihas Ke Kuch Vishay":
//                                break;
//                            case "Tareekh-e-Alam per Mabni Mauzuaat-I":
//                                break;
//                        }
//                        break;
//                    case "Sociology":
//                        bookTitle=new String[]{"Select Book","Introduction Sociology","Samajshastra-I","Samajiyaat Ka Tarf","Understanding Society","Samaj ka Bodh","Mutala-e-Muashira"};
//                        switch (bookName){
//                            case "Introduction Sociology":
//                                break;
//                            case "Samajshastra-I":
//                                break;
//                            case "Samajiyaat Ka Tarf":
//                                break;
//                            case "Understanding Society":
//                                break;
//                            case "Samaj ka Bodh":
//                                break;
//                            case "Mutala-e-Muashira":
//                                break;
//                        }
//                        break;
//                    case "Psychology":
//                        bookTitle=new String[]{"Select Book","Introduction to Psychology","Manovigyan","Nafsiyaat"};
//                        switch (bookName){
//                            case "Introduction to Psychology":
//                                break;
//                            case "Manovigyan":
//                                break;
//                            case "Nafsiyaat":
//                                break;
//                        }
//                        break;
//                    case "Accountancy":
//                        bookTitle=new String[]{"Select Book","Accounting-I","Accounting-II","Lekhashastra-I","Lekhashastra-II","Khatadari-I","Khatadari-II"};
//                        switch (bookName){
//                            case "Accounting-I":
//                                break;
//                            case "Accounting-II":
//                                break;
//                            case "Lekhashastra-I":
//                                break;
//                            case "Lekhashastra-II":
//                                break;
//                            case "Khatadari-I":
//                                break;
//                            case "Khatadari-II":
//                                break;
//                        }
//                        break;
//                    case "Geography":
//                        bookTitle=new String[]{"Select Book","Fundamental of Physical Geography","Political Work in Geography","India Physical Environment","Bhautique Bhugol ke Mool Sidhant","Tabai Gugraphiya ke Mubadiyat",
//                                "Hindustan Tabiee Mahol(Urdu)","Geographia mein amli kaam(Urdu)","Bhugol main Prayogatmak Karya","Bhart Bhautik Paryabaran","Jughrafia Mein Aamli Kam","Geographiya Ke Mubadiyat"};
//                        switch (bookName){
//                            case "Fundamental of Physical Geography":
//                                break;
//                            case "Political Work in Geography":
//                                break;
//                            case "India Physical Environment":
//                                break;
//                            case "Bhautique Bhugol ke Mool Sidhant":
//                                break;
//                            case "Tabai Gugraphiya ke Mubadiyat":
//                                break;
//                            case "Hindustan Tabiee Mahol(Urdu)":
//                                break;
//                            case "Geographia mein amli kaam(Urdu)":
//                                break;
//                            case "Bhugol main Prayogatmak Karya":
//                                break;
//                            case "Bhart Bhautik Paryabaran":
//                                break;
//                            case "Jughrafia Mein Aamli Kam":
//                                break;
//                            case "Geographiya Ke Mubadiyat":
//                                break;
//                        }
//                        break;
//                    case "Political Science":
//                        bookTitle=new String[]{"Select Book","Political Theory","Raajneeti Sidhant","Hindustani Aain aur Kaam","Indian Economic Development(Urdu)","India Constitution at Work","Bharat ka Samvidhan Sidhant aur Vyavhar","Siyasi Nazaria"};
//                        switch (bookName){
//                            case "Political Theory":
//                                break;
//                            case "Raajneeti Sidhant":
//                                break;
//                            case "Hindustani Aain aur Kaam":
//                                break;
//                            case "Indian Economic Development(Urdu)":
//                                break;
//                            case "India Constitution at Work":
//                                break;
//                            case "Bharat ka Samvidhan Sidhant aur Vyavhar":
//                                break;
//                            case "Siyasi Nazaria":
//                                break;
//
//                        }
//                        break;
//                    case "Business Studies":
//                        bookTitle=new String[]{"Select Book","Business Studies","Vyavsay Adhyanan","Karobari Uloom"};
//                        switch (bookName){
//                            case "Business Studies":
//                                break;
//                            case "Vyavsay Adhyanan":
//                                break;
//                            case "Karobari Uloom":
//                                break;
//                        }
//                        break;
//                    case "Graphic Design":
//                        bookTitle=new String[]{"Select Book","The story of graphic design","Graphic Design ek Kahani"};
//                        switch (bookName){
//                            case "The story of graphic design":
//                                break;
//                            case "Graphic Design ek Kahani":
//                                break;
//                        }
//                        break;
//                    case "Home Science":
//                        bookTitle=new String[]{"Select Book","Human Ecology and Family Sciences-I","Human Ecology and Family Sciences-II","Manav Paristhitiki evm pariwar vigyan-I","Manav Paristhitiki evm pariwar vigyan-II","Insani Mahauliyat aur Uloom e Khandandari-I","Insani Mahauliyat aur Uloom e Khandandari-II"};
//                        switch (bookName){
//                            case "Human Ecology and Family Sciences-I":
//                                break;
//                            case "Human Ecology and Family Sciences-II":
//                                break;
//                            case "Manav Paristhitiki evm pariwar vigyan-I":
//                                break;
//                            case "Manav Paristhitiki evm pariwar vigyan-II":
//                                break;
//                            case "Insani Mahauliyat aur Uloom e Khandandari-I":
//                                break;
//                            case "Insani Mahauliyat aur Uloom e Khandandari-II":
//                                break;
//                        }
//                        break;
//                    case "Economics":
//                        bookTitle=new String[]{"Select Book","Indian Economic Development","Statistics for Economics","Sankhyiki","Bhartiya Airthryavstha Ka Vikas","Hindustan Ki Moaashi Tarraqqi(Urdu)","Shumariyaat Bar-e-Mushiyat(Urdu)"};
//                        switch (bookName){
//                            case "Indian Economic Development":
//                                break;
//                            case "Statistics for Economics":
//                                break;
//                            case "Sankhyiki":
//                                break;
//                            case "Bhartiya Airthryavstha Ka Vikas":
//                                break;
//                            case "Hindustan Ki Moaashi Tarraqqi(Urdu)":
//                                break;
//                            case "Shumariyaat Bar-e-Mushiyat(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Heritage Crafts":
//                        bookTitle=new String[]{"Select Book","Living Craft Traditions of India","Hindustan me Dastkari Ki Riwayat","Dastkari"};
//                        switch (bookName){
//                            case "Living Craft Traditions of India":
//                                break;
//                            case "Hindustan me Dastkari Ki Riwayat":
//                                break;
//                            case "Dastkari":
//                                break;
//                        }
//                        break;
//                    case "Creative Writing and Technology":
//                        bookTitle=new String[]{"Select Book","Srijan","Takhleequi Jauhar"};
//                        switch (bookName){
//                            case "Srijan":
//                                break;
//                            case "Takhleequi Jauhar":
//                                break;
//                        }
//                        break;
//
//                }
//                break;
//            case 12:
//                switch (SubjectName){
//                    case "Mathematics":
//                        bookTitle=new String[]{"Select Book","Mathematics-I","Mathematics-II","Ganit-I","Ganit-II","Riyazi-I(Urdu)","Riyazi-II(Urdu)"};
//                        switch (bookName){
//                            case "Mathematics-I":
//                                break;
//                            case "Mathematics-II":
//                                break;
//                            case "Ganit-I":
//                                break;
//                            case "Ganit-II":
//                                break;
//                            case "Riyazi-I":
//                                break;
//                            case "Riyazi-II":
//                                break;
//                        }
//                        break;
//                    case "English":
//                        bookTitle=new String[]{"Select Book","Kaliedoscope","Flamingo","Vistas"};
//                        switch (bookName){
//                            case "Kaliedoscope":
//                                break;
//                            case "Flamingo":
//                                break;
//                            case "Vistas":
//                                break;
//                        }
//                        break;
//                    case "Hindi":
//                        bookTitle=new String[]{"Select Book","Antra","Aroh","Vitan","Antral"};
//                        switch (bookName){
//                            case "Antra":
//                                break;
//                            case "Aroh":
//                                break;
//                            case "Vitan":
//                                break;
//                            case "Antral":
//                                break;
//                        }
//                        break;
//                    case "Urdu":
//                        bookTitle=new String[]{"Select Book","Nai Awaz","Dhanak","Gulistan-e Adab","Khyaban-e Urdu"};
//                        switch (bookName){
//                            case "Nai Awaz":
//                                break;
//                            case "Dhanak":
//                                break;
//                            case "Gulistan-e Adab":
//                                break;
//                            case "Khyaban-e Urdu":
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        bookTitle=new String[]{"Select Book","Bhaswati","Shashwati"};
//                        switch (bookName){
//                            case "Bhaswati":
//                                break;
//                            case "Shashwati":
//                                break;
//                        }
//                        break;
//                    case "Physics":
//                        bookTitle=new String[]{"Select Book","Bhautiki-I","Bhautiki-II","Physics-I","Physics-II","Tabiyaat-I","Tabiyaat-II"};
//                        switch (bookName){
//                            case "Bhautiki-I":
//                                break;
//                            case "Bhautiki-II":
//                                break;
//                            case "Physics-I":
//                                break;
//                            case "Physics-II":
//                                break;
//                            case "Tabiyaat-I":
//                                break;
//                            case "Tabiyaat-II":
//                                break;
//                        }
//                        break;
//                    case "Chemistry":
//                        bookTitle=new String[]{"Select Book","Chemistry-I","Chemistry-II","Rasayan Vigyan-1","Rasayan Vigyan-II","Keemiya-I","Keemiya-II"};
//                        switch (bookName){
//                            case "Chemistry-I":
//                                break;
//                            case "Chemistry-II":
//                                break;
//                            case "Rasayan Vigyan-1":
//                                break;
//                            case "Rasayan Vigyan-II":
//                                break;
//                            case "Keemiya-I":
//                                break;
//                            case "Keemiya-II":
//                                break;
//                        }
//                        break;
//                    case "Biology":
//                        bookTitle=new String[]{"Select Book","Biology","Jeev Vigyan","Hayatiyaat","Human Ecology andd Family Science"};
//                        switch (bookName){
//                            case "Biology":
//                                break;
//                            case "Jeev Vigyan":
//                                break;
//                            case "Human Ecology andd Family Science":
//                                break;
//                        }
//
//                        break;
//                    case "Computer Science":
//                        if (bookName.equals("Computer Science")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12","Chapter-13"};
//                        }
//                        break;
//                    case "Fine Art":
//                        if (bookName.equals("An Introduction to Indian Art-II")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8"};
//                        }
//                        break;
//                    case "History":
//                        bookTitle=new String[]{"Select Book","Themes in Indian History-I","Themes in Indian History-II","Bharatiya Itihas Ke Kuch Vishay-I","Bharatiya Itihas Ke Kuch Vishay-II","Tareekh-e-hind ke Mauzuaat-I","Tareekh-e-hind ke Mauzuaat-II"};
//                        switch (bookName){
//                            case "Themes in Indian History-I":
//                                break;
//                            case "Themes in Indian History-II":
//                                break;
//                            case "Bharatiya Itihas Ke Kuch Vishay-I":
//                                break;
//                            case "Bharatiya Itihas Ke Kuch Vishay-II":
//                                break;
//                            case "Tareekh-e-hind ke Mauzuaat-I":
//                                break;
//                            case "Tareekh-e-hind ke Mauzuaat-II":
//                                break;
//                        }
//                        break;
//                    case "Sociology":
//                        bookTitle=new String[]{"Select Book","Indian Society","Bhartiya Samaj","Social Change and Development in India","Bharat main Samajik Parivartan aur Vikas","Hindustani Samaj(Urdu)","Hindustan Mein Samaji Tabdili Aur Taraqqi(Urdu)"};
//                        switch (bookName){
//                            case "Indian Society":
//                                break;
//                            case "Bhartiya Samaj":
//                                break;
//                            case "Social Change and Development in India":
//                                break;
//                            case "Bharat main Samajik Parivartan aur Vikas":
//                                break;
//                            case "Hindustani Samaj(Urdu)":
//                                break;
//                            case "Hindustan Mein Samaji Tabdili Aur Taraqqi(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Psychology":
//                        bookTitle=new String[]{"Select Book","Psychology","Manovigyan","Nafsiyaat"};
//                        switch (bookName){
//                            case "Psychology":
//                                break;
//                            case "Manovigyan":
//                                break;
//                            case "Nafsiyaat":
//                                break;
//                        }
//                        break;
//                    case "Accountancy":
//                        bookTitle=new String[]{"Select Book","Accounting-I","Accounting-II","Lekhashastra-I","Lekhashastra-II","Khatadari-I","Khatadari-II","Computerised Accounting System"};
//                        switch (bookName){
//                            case "Accounting-I":
//                                break;
//                            case "Accounting-II":
//                                break;
//                            case "Lekhashastra-I":
//                                break;
//                            case "Lekhashastra-II":
//                                break;
//                            case "Khatadari-I":
//                                break;
//                            case "Khatadari-II":
//                                break;
//                            case "Computerised Accounting System":
//                                break;
//                        }
//                        break;
//                    case "Political Science":
//                        bookTitle=new String[]{"Select Book","Political Science-II","Swatantra Bharat Mein Rajniti","Contemporary World Politics","Samkalin Vishwa Rajniti","Aasri Alami Siyasat(Urdu)","Azadi Ke Baad Hindustan Ki Siyasat(Urdu)"};
//                        switch (bookName){
//                            case "Political Science-II":
//                                break;
//                            case "Swatantra Bharat Mein Rajniti":
//                                break;
//                            case "Contemporary World Politics":
//                                break;
//                            case "Samkalin Vishwa Rajniti":
//                                break;
//                            case "Aasri Alami Siyasat(Urdu)":
//                                break;
//                            case "Azadi Ke Baad Hindustan Ki Siyasat(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Business Studies":
//                        bookTitle=new String[]{"Select Book","Business Studies-I","Business Studies-II","Vyavsay Adhyanan-I","Vyavsay Adhyanan-II","Karobari Uloom-I","Karobari Uloom-II"};
//                        switch (bookName){
//                            case "Business Studies-I":
//                                break;
//                            case "Business Studies-II":
//                                break;
//                            case "Vyavsay Adhyanan-I":
//                                break;
//                            case "Vyavsay Adhyanan-II":
//                                break;
//                            case "Karobari Uloom-I":
//                                break;
//                            case "Karobari Uloom-II":
//                                break;
//
//                        }
//                        break;
//                    case "Graphic Design":
//                        if(bookName.equals("New Age of graphic design")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12","Glossary"};
//                        }
//                        break;
//                    case "Home Science":
//                        bookTitle=new String[]{"Select Book","Human Ecology and Family Sciences-I","Human Ecology and Family Sciences-II","Manav Paristhitiki evm pariwar vigyan-I","Manav Paristhitiki evm pariwar vigyan-II"};
//                        switch (bookName){
//                            case "Human Ecology and Family Sciences-I":
//                                break;
//                            case "Human Ecology and Family Sciences-II":
//                                break;
//                            case "Manav Paristhitiki evm pariwar vigyan-I":
//                                break;
//                            case "Manav Paristhitiki evm pariwar vigyan-II":
//                                break;
//                        }
//                        break;
//                    case "Economics":
//                        bookTitle=new String[]{"Select Book","Indian Economic Development","Statistics for Economics","Sankhyiki","Bhartiya Airthryavstha Ka Vikas","Hindustan Ki Moaashi Tarraqqi(Urdu)","Shumariyaat Bar-e-Mushiyat(Urdu)"};
//                        switch (bookName){
//                            case "Indian Economic Development":
//                                break;
//                            case "Statistics for Economics":
//                                break;
//                            case "Sankhyiki\",\"Bhartiya Airthryavstha Ka Vikas":
//                                break;
//                            case "Hindustan Ki Moaashi Tarraqqi(Urdu)":
//                                break;
//                            case "Shumariyaat Bar-e-Mushiyat(Urdu)":
//                                break;
//                        }
//                        break;
//                    case "Heritage Crafts":
//                        bookTitle=new String[]{"Select Book","Bharatiya Hastkla Ki Paramparayen","Hindustan me Dastkari Ki Riwayat","Craft Tradition of India"};
//                        switch (bookName){
//                            case "Bharatiya Hastkla Ki Paramparayen":
//                                break;
//                            case "Hindustan me Dastkari Ki Riwayat":
//                                break;
//                            case "Craft Tradition of India":
//                                break;
//                        }
//                        break;
//                    case "Creative Writing and Technology":
//                        if (bookName.equals("Takhleequi Jauhar")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11"};
//                        }
//                        break;
//                }
//                break;
//            case 13:
//                switch (SubjectName){
//                    case "Hindi":
//                        if(bookName.equals("Abhivyakti Aur Madhyam")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16"};
//                        }
//                        break;
//                    case "Urdu":
//                        switch (bookName){
//                            case "Zuban-O-Adab ki Tareekh":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22","Chapter-23"};
//                                break;
//                            case "Urdu Qwaid aur Insha":
//                                chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                        "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12", "Chapter-13","Chapter-14","Chapter-15","Chapter-16",
//                                        "Chapter-17","Chapter-18","Chapter-19","Chapter-20","Chapter-21","Chapter-22"};
//                                break;
//                        }
//                        break;
//                    case "Sanskrit":
//                        if(bookName.equals("Sanskrit Sahitya parichay")){
//                            chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                    "Chapter-8","Chapter-9","Chapter-10","Chapter-11","Chapter-12"};
//                        }
//                        break;
//                    case "Heritage Crafts":
//                        switch (bookName){
//                                case "Exploring Craft Tradition of India":
//                                    chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                            "Chapter-8","Chapter-9","Chapter-10"};
//                                    break;
//                                case "Bhartiya Hastkala Parmparaon ki Khoj":
//                                    chapterList=new String[]{"Prelims","Chapter-1","Chapter-2","Chapter-3","Chapter-4","Chapter-5","Chapter-6","Chapter-7",
//                                            "Chapter-8","Chapter-9","Chapter-10"};
//                                    break;
//                        }
//                        break;
//                }
//                break;
//
//        }
//        return chapterList;
//    }
}
