package hello.itemservice.lang;

import lombok.Getter;

import java.util.Locale;

@Getter
public enum Language {

    BASIC("한국어", Locale.KOREA),
    ENGLISH("영어", Locale.ENGLISH);

    private String lang;
    private Locale locale;

    Language(String lang, Locale locale) {
        this.lang = lang;
        this.locale = locale;
    }
}
