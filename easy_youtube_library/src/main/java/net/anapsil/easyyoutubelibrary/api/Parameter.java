package net.anapsil.easyyoutubelibrary.api;

/**
 * YouTube Data Api (v3) Parameters
 *
 * @author anapsil
 */
public enum Parameter {
    /**
     * The part parameter specifies a comma-separated list of one or more playlistItem resource
     * properties that the API response will include.
     * If the parameter identifies a property that contains child properties, the child properties
     * will be included in the response.
     * For example, in a playlistItem resource, the snippet property contains numerous fields,
     * including the title, description, position, and resourceId properties.
     * As such, if you set part=snippet, the API response will contain all of those properties.
     */
    PART("part"),

    /**
     * The id parameter specifies a comma-separated list of one or more unique playlist item IDs.
     */
    ID("id"),

    /**
     * The maxResults parameter specifies the maximum number of items that
     * should be returned in the result set.
     */
    MAX_RESULTS("maxResults"),

    /**
     * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials
     * identify a YouTube CMS user who is acting on behalf of the content owner specified in the
     * parameter value.
     * This parameter is intended for YouTube content partners that own and manage many different
     * YouTube channels.
     * It allows content owners to authenticate once and get access to all their video and channel
     * data, without having to provide authentication credentials for each individual channel.
     * The CMS account that the user authenticates with must be linked to the specified YouTube
     * content owner.
     */
    ON_BEHALF_OF_CONTENT_OWNER("onBehalfOfContentOwner"),

    /**
     * The pageToken parameter identifies a specific page in the result set that should be returned.
     * In an API response, the nextPageToken and prevPageToken properties identify other pages that
     * could be retrieved.
     */
    PAGE_TOKEN("pageToken"),

    /**
     * The playlistId parameter specifies the unique ID of the playlist for which you want to
     * retrieve playlist items. Note that even though this is an optional parameter, every request
     * to retrieve playlist items must specify a value for either the id parameter or the
     * playlistId parameter.
     */
    PLAYLIST_ID("playlistId"),

    /**
     * The videoId parameter specifies that the request should return only the playlist items that
     * contain the specified video.
     */
    VIDEO_ID("videoId"),

    /**
     * Selector specifying which fields to include in a partial response.
     */
    FIELDS("fields");

    private final String parameter;

    Parameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return this.parameter;
    }
}
