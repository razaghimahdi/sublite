package m4trixtm.sublite.features.subtitle

import kotlinx.coroutines.flow.Flow
import m4trixtm.sublite.features.ApiResponse
import m4trixtm.sublite.features.subtitle.entity.Subtitle
import m4trixtm.sublite.features.subtitle.entity.SubtitleDownloadLink

interface SubtitleRepository {

    fun search(
        query: String,
        onSuccess: () -> Unit,
        onError: (message: String) -> Unit
    ): Flow<ApiResponse<Subtitle>>

    fun getDownloadLink(
        subtitleId: Int,
        onSuccess: () -> Unit,
        onError: (message: String) -> Unit
    ): Flow<SubtitleDownloadLink>
}