package com.sameperson.newswebsite.model;

import java.util.ArrayList;


public class NewsList {

    private static NewsList instance;
    private ArrayList<NewsBean> listOfTheNews;

    public static NewsList getInstance() {
        if(instance == null) {
            instance = new NewsList();
        }
        return instance;
    }

    public synchronized void addNews(String name, String title, String body) {
        listOfTheNews.add(0, new NewsBean(name, title, body));
    }

    public ArrayList<NewsBean> getList() {
        return listOfTheNews;
    }

    public NewsBean findByName(String name) {
        for(NewsBean newsBean : listOfTheNews) {
            if(newsBean.getName().equals(name)) {
                return newsBean;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String titles = "";
        for(NewsBean newsBean : listOfTheNews) {
            titles += newsBean.getTitle() + " | ";
        }
        return titles;
    }


    protected NewsList() {
        listOfTheNews = new ArrayList<>();
        this.addNews("20160327-pluto-atmosphere-confounds-researchers", "Pluto's atmosphere confounds researchers", "    Observations by NASA's New Horizons spacecraft, combined " +
                        "with new modeling of long-term trends, suggest that Pluto's atmosphere is far more dynamic than anyone imagined.\n" +
                        "Every since its discovery in June 1988, Pluto's tenuous atmosphere has been a source of frequent discussion and debate " +
                        "among outer-planet specialists. Pluto is so cold, about 45 Kelvin (–380° Fahrenheit) that the frozen nitrogen, " +
                        "methane, and carbon monoxide on its surface sublimate (convert directly to gas) only very slowly. Moreover, given " +
                        "Pluto's strongly eccentric orbit and that it swung closest to the Sun (perihelion) in 1989, many researchers believed " +
                        "that what little gas surrounded this little world would all soon freeze and precipitate onto the surface. In fact, the " +
                        "prospect of a soon-to-be-airless Pluto became a compelling reason for NASA to fund and launch New Horizons.\n"
        );
        this.addNews("20160327-dark-comet-flyby", "Dark comet's flyby of Earth observed with radar and infrared", "    Astronomers were watching " +
                "when comet P/2016 BA14 flew past Earth on 22 March. At the time of its closest approach, the comet was about 2.2 million miles " +
                "(3.5 million kilometres) away, making it the second closest flyby of a comet in recorded history next to comet D/1770 L1 (Lexell)" +
                " in 1770. Radar images from the flyby indicate that the comet is about 3,000 feet (1 kilometre) in diameter.\n" +
                "The scientists used the Goldstone Solar System Radar in California’s Mojave Desert to track the comet. \"We were able to obtain " +
                "very detailed radar images of the comet nucleus over three nights around the time of closest approach,\" said Shantanu Naidu, a " +
                "postdoctoral researcher at NASA’s Jet Propulsion Laboratory in Pasadena, California, who works with the radar team and led the " +
                "observations during the comet’s flyby. We can see surface features as small as 8 metres per pixel.");
    }

}
