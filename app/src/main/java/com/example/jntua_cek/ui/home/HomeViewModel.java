package com.example.jntua_cek.ui.home;

import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("About Us: \b\n" +
                "                 JNTUA College of Engineering, Kalikiri (JNTUACEK) was established in the year 2013 (G.O No. 211, Go.No. 1), with a social objective of providing quality education to the rural youth. The institute is a constituent college of Jawaharlal Nehru Technological University Anantapur (JNTUA) and recognised by All India Council for Technical Education (AICTE), New Delhi.\n" +
                "\n"+ "                The college is located on national high way (NH-71) in an area of 107.23 acres of scenic beauty at Kalikiri Panchayat & Mandal, Chittoor (District), Andhra Pradesh. The college is located 45 K.M away from Madanapalli and 75 K.M from Tirupati. The college is currently offering six B-Tech programmes namely Civil Engineering, Mechanical Engineering, Electrical & Electronics Engineering, Electronics & Communication Engineering, Computer Science & Engineering and Food Technology (From the A.Y. 2018-19)." +
                "\n"+"                 The college is governed by the rules and guidelines provided by the university from time to time. The day to day activities of the college are carried out by budgetary allocation from the university fund. The college has a variety of buildings serving the various academic needs of the college like Administrative, Academic block, Library, Workshops, Canteen, Boys and Girls Hostels, Guest house, Staff quarters, Dispensary, Auditorium etc., with approximately built-up area of 11,437,13 sq.ft.\n" +
                "\n"+"                 The college has spacious well design, adequately furnished and ventilated classrooms. All the laboratories of engineering and sciences are well equipped with the required equipment. The laboratories and workshops are fully equipped with state-of –the-art facilities. In particular the Computer, CAD/CAM and Language laboratories are value added assets to this college. Civil, Mechanical, ECE, EEE, CSE departments in the college is maintaining the student- faculty ratio as per the AICTE norms. Every department is provided with seminar and conference halls."+"\n"+
                "\n"+"                 Well-equipped 540 seating capacity auditorium is an important monument for conducting International conferences. Seminars, Workshops, Symposia, Conferences and Guest lectures have been conducting by every department to create awareness to the students on latest technologies and providing opportunities to improve their communication skills, leadership qualities and personality development.\n" +
                "\n"+"                 Different types of facilities are available in the college like Placement and Training cell, NSS units, Central Library, Dispensary, Women grievance cell, Indoor stadium and Outdoor sports facilities etc. The Central Library has total 788 titles and 6539 book volumes. The students are encouraged to make full use of the library and other facilities like accessing E-books and E-journals through digital library."+"\n"+
                "\n"+"                 In addition to the library a book bank with 67 titles and 1712 volumes are available for disposal of SC, ST, Backward students. Library and digital library is functioning from 8 A.M. to 8. P.M. to facilitate computing and internet facilities beyond the working hours. The entire campus is networked (including hostels and staff quarters) through Wired and Wi-Fi internet connectivity and also the campus is under surveillance of closed circuit cameras. " +
                "\n"+"                 The internet bandwidth is provided as per AICTE norms. NSS Units have been organising various activities like blood donation camps, mass tree plantations, public traffic awareness rally’s etc., The college provides medical facilities in the campus through equipped dispensary. Boys and Girls hostels are equipped with premium facilities like cots, kitchen equipment, internet connectivity and R.O mineral drinking water plants. College is governed by different committees such as anti-ragging committee, discipline committee etc. The infrastructure of the college is constantly under expansion to keep pace with the growing need and trends of the technological changes.\n" +
                "\n"+"About Kalikiri:\b\n" +
                "\n"+"                 Kalikiri is located in the Chittoor district of Andhra Pradesh, between Madanapalli, which is about 40 km away, and Tirupathi, which is about 75 km away, which means it is very close to the main cities of south India: Bangalore and Chennai. " +
                "\n"+"                 Kalikiri Mandal is bounded by Vayalpad Mandal towards west, Piler Mandal towards East, and Sodam Mandal towards East. Madanapalle, Punganur, Rayachoti, Chittoor and Tirupathi are the nearby Towns to Kalikiri. Kalikiri Mandal consist of 163 Villages and 14 Panchayats. Cheekatipalle is the smallest Village and Kalikiri is the biggest Village. Horsley Hills, Chittoor, Tirupati (Tirumala), Vellore, Kadapa (Cuddapah) are the nearby Important tourist destinations to visit. " +
                "\n"+"                 Kalikiri is a Mandal with a population of around 28,000 in the Chittoor district of Andhra Pradesh, India. This place is famous for its tomato market, which supplies tomatoes to other districts in Andhra Pradesh and other states, like Tamil Nadu and Kerala.The culture of Kalikiri is a mixture of several neighboring regions, with influences of the Rayalaseema region in Andhra Pradesh.\n" +
               "\n"+ "Origin:\b\n" +
                "\n"+"                 Local folklore dictates the name “Kalikiri” originates from two dancing sisters, Kalki and Kulki, who were given the land by the local ruler. Although this fact is not documented anywhere it is traditionally seen as the origin of the town.\n" +
                "\n"+"Important Places:\b\n" +
                "\n"+"                 Kalikiri is famous for its Ayurvedic Medicine especially for the treatment of paralysis.\n" +
                "\n"+"                 Kalikiri in chittoor is privileged to get the second Sainik School in Andhra Pradesh.\n" +
                "\n"+"                 The most famous temples in the Kalikiri are Ayyappa Swamy Temple, SaiBaba Temple, and Yellamma Temple.\n" +
                "\n"+"                 Kalikiri is privileged to have CRPF Rational Training Camp and Firing Range, a BSF new Battalion and State training centre and a battalion of the Indo-Tibetan Border Police.");
    }
    public LiveData<String> getText() {
        return mText;
    }

}