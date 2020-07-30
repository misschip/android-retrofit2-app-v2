package com.pyj.movieapp;




import java.util.List;

import lombok.Data;

@Data
public class YtsData {
    private String status;
    private String status_message;
    private MyData data;

    @Data
    public class MyData {
        private int movie_count;
        private int limit;
        private int page_number;
        private List<Movie> movies;

        @Data
        public class Movie{
            private String title;
            private float rating;
            private String medium_cover_image;
        }

        @Override
        public String toString() {
            return "MyData{" +
                    "movie_count=" + movie_count +
                    ", limit=" + limit +
                    ", page_number=" + page_number +
                    ", movies=" + movies +
                    '}';
        }
    }

    // 이 클래스 구조가 복잡하므로 lombok에만 맡겨 놓기보다는 이렇게 해놓고 보면 편리함
    @Override
    public String toString() {
        return "YtsData{" +
                "status='" + status + '\'' +
                ", status_message='" + status_message + '\'' +
                ", data=" + data +
                '}';
    }
}