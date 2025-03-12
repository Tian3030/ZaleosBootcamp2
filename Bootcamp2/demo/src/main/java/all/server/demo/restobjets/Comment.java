package all.server.demo.restobjets;

public class Comment {
    private int comment_id;
    private int username;
    private String comment;

    public Comment(int comment_id, int username, String comment) throws IllegalArgumentException{

        if (comment == null || comment.equals("")) throw new IllegalArgumentException("Illegal comment");
        this.comment_id=comment_id;
        this.username = username;
        this.comment = comment;
    }

    // GETTERS
    public int getComment_Id() { return this.comment_id;}
    public int getUsername() { return this.username;}
    public String getComment() {return this.comment;}

    //SETTERS
    public void setUsername(int username) {this.username = username;}
    public void setComment(String comment) {this.comment = comment;}

}