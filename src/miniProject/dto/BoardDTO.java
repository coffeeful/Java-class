package miniProject.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
        private Long id;
        private String catBreed; //품종
        private String catName; //이름
        private String CatAge; // 나이
        private String CatSex; //성별
        private String catWirther;
        private String catTitle; //일기 이름
        private String catContents; //일기 내용

    public BoardDTO(String catWirther, String catTitle, String catContents) {
        this.catWirther = catWirther;
        this.catTitle = catTitle;
        this.catContents = catContents;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatWirther() {
        return catWirther;
    }

    public void setCatWirther(String catWirther) {
        this.catWirther = catWirther;
    }

    public String getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(String catTitle) {
        this.catTitle = catTitle;
    }

    public String getCatContents() {
        return catContents;
    }

    public void setCatContents(String catContents) {
        this.catContents = catContents;
    }


    private String createAt;

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatAge() {
        return CatAge;
    }

    public void setCatAge(String catAge) {
        CatAge = catAge;
    }

    public String getCatSex() {
        return CatSex;
    }

    public void setCatSex(String catSex) {
        CatSex = catSex;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public static Long idvalue = 1L;

    public BoardDTO(String catBreed, String catName, String catAge, String catSex,
                    String catWirther, String catTitle, String catContents) {
        this.id = idvalue++;
        this.catBreed = catBreed;
        this.catName = catName;
        CatAge = catAge;
        CatSex = catSex;
        this.catWirther = catWirther;
        this.catTitle = catTitle;
        this.catContents = catContents;
        this.createAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss "));
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", catBreed='" + catBreed + '\'' +
                ", catName='" + catName + '\'' +
                ", CatAge='" + CatAge + '\'' +
                ", CatSex='" + CatSex + '\'' +
                ", catDiary='" + catWirther + '\'' +
                ", catTitle='" + catTitle + '\'' +
                ", catContents='" + catContents + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}