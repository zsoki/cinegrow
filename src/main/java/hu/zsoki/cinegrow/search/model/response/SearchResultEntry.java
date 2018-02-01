package hu.zsoki.cinegrow.search.model.response;

import hu.zsoki.cinegrow.api.omdb.model.response.OmdbSearchResultEntry;
import lombok.Data;

@Data
public class SearchResultEntry {

    private final String title;
    private final String imdbID;
    private final String year;

    public SearchResultEntry(OmdbSearchResultEntry omdbSearchResultEntry) {
        this.title = omdbSearchResultEntry.getTitle();
        this.imdbID = omdbSearchResultEntry.getImdbID();
        this.year = omdbSearchResultEntry.getYear();
    }

}