module news {
    requires slf4j.simple;
    requires slf4j.api;
    requires guava;
    requires gson;

    opens org.news to gson;
}