package sprint_4.theme_3.postcomment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Post post = (Post) object;
        return Objects.equals(title, post.title) && Objects.equals(content, post.content) && Objects.deepEquals(tags, post.tags) && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, Arrays.hashCode(tags), comments);
    }

    PostComment postComment = new PostComment();

    @Override
    public String toString() {
        String result = "Post{" +
                "title='" + title + '\'';

        if (content != null) {
            result = result + ", content.length=" + content.length();
        } else {
            result = result + ", content=null";
        }
        return result + ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                '}';
    }


/* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */

}
/*Override
public String toString() {
    String result = "Address{" +
            "city='" + city + '\'' +
            ", street='" + street + '\'' +
            ", houseNumber=" + houseNumber + '\'';

    if(extraInfo != null) {
        result = result + ", extraInfo.length=" + extraInfo.length();
    } else {
        result = result + ", extraInfo=null";
    }

    return result + ", residents=" + Arrays.toString(residents) + '}';
}
}*/