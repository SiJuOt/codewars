package de.sijuot.codewars;

import java.util.ArrayList;
import java.util.List;

public class FriendOrFoe {

    /**
     * Gibt eine List zurück, welche nur deine Freunde enthält.
     * Wenn ein Name exakt 4 Buchstaben lang ist, kann man sich sicher sein, dass jener dein Freund ist.
     * Sonst kannst du dir nicht sicher sein
     * @param x Eine Liste voller Namen.
     * @return Eine Liste mit deinen Freunden
     */
    public static List<String> friend(List<String> x) {
        List<String> friends = new ArrayList<String>();
        for(String name : x) {
            if(name.length() == 4)
                friends.add(name);
        }
        return friends;
    }
}
