package hu.zsoki.cinegrow.data.mongo;

import hu.zsoki.cinegrow.data.mongo.document.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, Long> {
}
