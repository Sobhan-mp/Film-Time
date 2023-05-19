package io.filmtime.domain.tmdb.movies

import io.filmtime.data.model.VideoThumbnail
import io.fimltime.data.tmdb.movies.TmdbMovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class GetPopularMoviesUseCaseImpl @Inject constructor(
  private val tmdbMovieRepository: TmdbMovieRepository,
) : GetPopularMoviesUseCase {

  override suspend fun invoke(): Flow<List<VideoThumbnail>> = flow {
    emit(tmdbMovieRepository.getPopularMovies())
  }
}
