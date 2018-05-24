package service;

import domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class AdvertisementService {

    String name = "Arnis";
    public List<Advertisement> hardcodedAdvertisementList;
    public List<Advertisement> reverseAdvertisementList;

    public AdvertisementService() {
        hardcodedAdvertisementList = hardcodedAdvertisementInititialization();
        reverseAdvertisementList = hardcodedAdvertisementList;
        Collections.reverse(reverseAdvertisementList);

        //adE = new AdvertisementService(1, "Arnis", 2011, (float) 525, "This is the first description!");
        //adD = new AdvertisementService(2, "Arnis", 2012, (float) 2113, "This is the second description!");
        //adU = new AdvertisementService(3, "Arnis", 2013, (float) 545, "This is the third description!");
        //adA = new AdvertisementService(4, "Arnis", 2014, (float) 113, "This is the forth description!");
        //adR = new AdvertisementService(5, "Arnis", 2015, (float) 3561, "This is the fifth description!");
        //adD = new AdvertisementService(6, "Arnis", 2016, (float) 211, "This is the second description!");
        //adS = new AdvertisementService(7, "Arnis", 2017, (float) 6347, "This is the seventh description!");

    }

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod maaju", "Paardod maaju", "Janis");
        return advertisement;
    }

    public List<Advertisement> getAdvertisementListByAuthor(String author) {
        List<Advertisement> filteredByName = new ArrayList<>();
        for (Advertisement advertisement : hardcodedAdvertisementList) {
            if(advertisement.getAuthor().matches(author)) {
                filteredByName.add(advertisement);
            }
        }
        return filteredByName;
    }

    public List<Advertisement> getAdvertisementListReverse() {
        return reverseAdvertisementList;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod maaju", "Paardod maaju", "Aleksis");


        advertisements.add(advertisement);

        return advertisements;
    }

    private List<Advertisement> hardcodedAdvertisementInititialization() {
        List<Advertisement> advertisements = new ArrayList<>();
        for (int i = 1; i < name.length(); i++) {
            Advertisement advertisement = new Advertisement(Long.valueOf(i),
                    "House", "Selling house on Brivibas street, nr. " + i, getAuthorName(i));
            advertisements.add(advertisement);
        }
        return advertisements;
    }


    public String getAuthorName(int i) {
        if(i % 2 == 0 ) {
            return "Peteris";
        }
        return "Es";
    }
}