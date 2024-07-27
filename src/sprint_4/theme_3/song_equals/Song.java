package sprint_4.theme_3.song_equals;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false; // проверяем ссылку на null
        if (this.getClass() != object.getClass()) return false; // сравниваем классы
        Song otherSong = (Song) object; // открываем доступ к полям другого объекта
        return Objects.equals(title, otherSong.title) && // проверяем все поля
                Objects.equals(artist, otherSong.artist) && // нужно логическое «и»
                Objects.equals(songwriter, otherSong.songwriter);
    }
}