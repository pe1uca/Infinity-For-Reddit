package ml.docilealligator.infinityforreddit.Utils;

import android.content.SharedPreferences;

import ml.docilealligator.infinityforreddit.CustomTheme.CustomTheme;

public class CustomThemeSharedPreferencesUtils {
    public static final int LIGHT = 0;
    public static final int DARK = 1;
    public static final int AMOLED = 2;
    public static final String LIGHT_THEME_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.light_theme";
    public static final String DARK_THEME_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.dark_theme";
    public static final String AMOLED_THEME_SHARED_PREFERENCES_FILE = "ml.docilealligator.infinityforreddit.amoled_theme";
    public static final String LIGHT_STATUS_BAR = "lightStatusBar";
    public static final String LIGHT_NAV_BAR = "lightNavBar";
    public static final String CHANGE_STATUS_BAR_ICON_COLOR_AFTER_TOOLBAR_COLLAPSED_IN_IMMERSIVE_INTERFACE = "changeStatusBarIconColorImmersive";
    public static final String COLOR_PRIMARY = "colorPrimary";
    public static final String COLOR_PRIMARY_DARK = "colorPrimaryDark";
    public static final String COLOR_ACCENT = "colorAccent";
    public static final String COLOR_PRIMARY_LIGHT_THEME = "colorPrimaryLightTheme";
    public static final String POST_TITLE_COLOR = "postTitleColor";
    public static final String POST_CONTENT_COLOR = "postContentColor";
    public static final String COMMENT_COLOR = "commentColor";
    public static final String PRIMARY_TEXT_COLOR = "primaryTextColor";
    public static final String SECONDARY_TEXT_COLOR = "secondaryTextColor";
    public static final String BUTTON_TEXT_COLOR = "buttonTextColor";
    public static final String BACKGROUND_COLOR = "backgroundColor";
    public static final String CARD_VIEW_BACKGROUND_COLOR = "cardViewBackgroundColor";
    public static final String COMMENT_BACKGROUND_COLOR = "commentBackgroundColor";
    public static final String BOTTOM_APP_BAR_BACKGROUND_COLOR = "bottomAppBarBackgroundColor";
    public static final String PRIMARY_ICON_COLOR = "primaryIconColor";
    public static final String POST_ICON_AND_INFO_COLOR = "postIconAndInfoColor";
    public static final String COMMENT_ICON_AND_INFO_COLOR = "commentIconAndInfoColor";
    public static final String TOOLBAR_PRIMARY_TEXT_AND_ICON_COLOR = "toolbarPrimaryTextAndIconColor";
    public static final String TOOLBAR_SECONDARY_TEXT_COLOR = "toolbarSecondaryTextColor";
    public static final String CIRCULAR_PROGRESS_BAR_BACKGROUND = "circularProgressBarBackground";
    public static final String TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TAB_BACKGROUND = "tabLayoutWithExpandedCollapsingToolbarTabBackground";
    public static final String TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TEXT_COLOR = "tabLayoutWithExpandedCollapsingToolbarTextColor";
    public static final String TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TAB_INDICATOR = "tabLayoutWithExpandedCollapsingToolbarTabIndicator";
    public static final String TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TAB_BACKGROUND = "tabLayoutWithCollapsedCollapsingToolbarTabBackground";
    public static final String TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TEXT_COLOR = "tabLayoutWithCollapsedCollapsingToolbarTextColor";
    public static final String TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TAB_INDICATOR = "tabLayoutWithCollapsedCollapsingToolbarTabIndicator";
    public static final String NAV_BAR_COLOR = "navBarColor";
    public static final String UPVOTED = "upvoted";
    public static final String DOWNVOTED = "downvoted";
    public static final String POST_TYPE_BACKGROUND_COLOR = "postTypeBackgroundColor";
    public static final String POST_TYPE_TEXT_COLOR = "postTypeTextColor";
    public static final String SPOILER_BACKGROUND_COLOR = "spoilerBackgroundColor";
    public static final String SPOILER_TEXT_COLOR = "spoilerTextColor";
    public static final String NSFW_BACKGROUND_COLOR = "nsfwBackgroundColor";
    public static final String NSFW_TEXT_COLOR = "nsfwTextColor";
    public static final String FLAIR_BACKGROUND_COLOR = "flairBackgroundColor";
    public static final String FLAIR_TEXT_COLOR = "flairTextColor";
    public static final String ARCHIVED_ICON_TINT = "archivedIconTint";
    public static final String LOCKED_ICON_TINT = "lockedIconTint";
    public static final String CROSSPOST_ICON_TINT = "crosspostIconTint";
    public static final String STICKIED_POST_ICON_TINT = "stickiedPost";
    public static final String SUBSCRIBED = "subscribed";
    public static final String UNSUBSCRIBED = "unsubscribed";
    public static final String USERNAME = "username";
    public static final String SUBREDDIT = "subreddit";
    public static final String AUTHOR_FLAIR_TEXT_COLOR = "authorFlairTextColor";
    public static final String SUBMITTER = "submitter";
    public static final String MODERATOR = "moderator";
    public static final String SINGLE_COMMENT_THREAD_BACKGROUND_COLOR = "singleCommentThreadBackgroundColor";
    public static final String UNREAD_MESSAGE_BACKGROUND_COLOR = "unreadMessageBackgroundColor";
    public static final String DIVIDER_COLOR = "dividerColor";
    public static final String NO_PREVIEW_LINK_BACKGROUND_COLOR = "noPreviewLinkBackgroundColor";
    public static final String VOTE_AND_REPLY_UNAVAILABLE_BUTTON_COLOR = "voteAndReplyUnavailableButtonColor";
    public static final String COMMENT_VERTICAL_BAR_COLOR_1 = "commentVerticalBarColor1";
    public static final String COMMENT_VERTICAL_BAR_COLOR_2 = "commentVerticalBarColor2";
    public static final String COMMENT_VERTICAL_BAR_COLOR_3 = "commentVerticalBarColor3";
    public static final String COMMENT_VERTICAL_BAR_COLOR_4 = "commentVerticalBarColor4";
    public static final String COMMENT_VERTICAL_BAR_COLOR_5 = "commentVerticalBarColor5";
    public static final String COMMENT_VERTICAL_BAR_COLOR_6 = "commentVerticalBarColor6";
    public static final String COMMENT_VERTICAL_BAR_COLOR_7 = "commentVerticalBarColor7";
    public static final String FAB_ICON_COLOR = "fabIconColor";
    public static final String CHIP_TEXT_COLOR = "chipTextColor";

    public static void insertThemeToSharedPreferences(CustomTheme customTheme, SharedPreferences themeSharedPreferences) {
        SharedPreferences.Editor editor = themeSharedPreferences.edit();
        editor.putInt(COLOR_PRIMARY, customTheme.colorPrimary);
        editor.putInt(COLOR_PRIMARY_DARK, customTheme.colorPrimaryDark);
        editor.putInt(COLOR_ACCENT, customTheme.colorAccent);
        editor.putInt(COLOR_PRIMARY_LIGHT_THEME, customTheme.colorPrimaryLightTheme);
        editor.putInt(PRIMARY_TEXT_COLOR, customTheme.primaryTextColor);
        editor.putInt(SECONDARY_TEXT_COLOR, customTheme.secondaryTextColor);
        editor.putInt(POST_TITLE_COLOR, customTheme.postTitleColor);
        editor.putInt(POST_CONTENT_COLOR, customTheme.postContentColor);
        editor.putInt(COMMENT_COLOR, customTheme.commentColor);
        editor.putInt(BUTTON_TEXT_COLOR, customTheme.buttonTextColor);
        editor.putInt(BACKGROUND_COLOR, customTheme.backgroundColor);
        editor.putInt(CARD_VIEW_BACKGROUND_COLOR, customTheme.cardViewBackgroundColor);
        editor.putInt(COMMENT_BACKGROUND_COLOR, customTheme.commentBackgroundColor);
        editor.putInt(BOTTOM_APP_BAR_BACKGROUND_COLOR, customTheme.bottomAppBarBackgroundColor);
        editor.putInt(PRIMARY_ICON_COLOR, customTheme.primaryIconColor);
        editor.putInt(POST_ICON_AND_INFO_COLOR, customTheme.postIconAndInfoColor);
        editor.putInt(COMMENT_ICON_AND_INFO_COLOR, customTheme.commentIconAndInfoColor);
        editor.putInt(TOOLBAR_PRIMARY_TEXT_AND_ICON_COLOR, customTheme.toolbarPrimaryTextAndIconColor);
        editor.putInt(TOOLBAR_SECONDARY_TEXT_COLOR, customTheme.toolbarSecondaryTextColor);
        editor.putInt(CIRCULAR_PROGRESS_BAR_BACKGROUND, customTheme.circularProgressBarBackground);
        editor.putInt(TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TAB_BACKGROUND, customTheme.tabLayoutWithExpandedCollapsingToolbarTabBackground);
        editor.putInt(TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TEXT_COLOR, customTheme.tabLayoutWithExpandedCollapsingToolbarTextColor);
        editor.putInt(TAB_LAYOUT_WITH_EXPANDED_COLLAPSING_TOOLBAR_TAB_INDICATOR, customTheme.tabLayoutWithExpandedCollapsingToolbarTabIndicator);
        editor.putInt(TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TAB_BACKGROUND, customTheme.tabLayoutWithCollapsedCollapsingToolbarTabBackground);
        editor.putInt(TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TEXT_COLOR, customTheme.tabLayoutWithCollapsedCollapsingToolbarTextColor);
        editor.putInt(TAB_LAYOUT_WITH_COLLAPSED_COLLAPSING_TOOLBAR_TAB_INDICATOR, customTheme.tabLayoutWithCollapsedCollapsingToolbarTabIndicator);
        editor.putInt(NAV_BAR_COLOR, customTheme.navBarColor);
        editor.putInt(UPVOTED, customTheme.upvoted);
        editor.putInt(DOWNVOTED, customTheme.downvoted);
        editor.putInt(POST_TYPE_BACKGROUND_COLOR, customTheme.postTypeBackgroundColor);
        editor.putInt(POST_TYPE_TEXT_COLOR, customTheme.postTypeTextColor);
        editor.putInt(SPOILER_BACKGROUND_COLOR, customTheme.spoilerBackgroundColor);
        editor.putInt(SPOILER_TEXT_COLOR, customTheme.spoilerTextColor);
        editor.putInt(NSFW_BACKGROUND_COLOR, customTheme.nsfwBackgroundColor);
        editor.putInt(NSFW_TEXT_COLOR, customTheme.nsfwTextColor);
        editor.putInt(FLAIR_BACKGROUND_COLOR, customTheme.flairBackgroundColor);
        editor.putInt(FLAIR_TEXT_COLOR, customTheme.flairTextColor);
        editor.putInt(ARCHIVED_ICON_TINT, customTheme.archivedTint);
        editor.putInt(LOCKED_ICON_TINT, customTheme.lockedIconTint);
        editor.putInt(CROSSPOST_ICON_TINT, customTheme.crosspostIconTint);
        editor.putInt(STICKIED_POST_ICON_TINT, customTheme.stickiedPostIconTint);
        editor.putInt(SUBSCRIBED, customTheme.subscribed);
        editor.putInt(UNSUBSCRIBED, customTheme.unsubscribed);
        editor.putInt(USERNAME, customTheme.username);
        editor.putInt(SUBREDDIT, customTheme.subreddit);
        editor.putInt(AUTHOR_FLAIR_TEXT_COLOR, customTheme.authorFlairTextColor);
        editor.putInt(SUBMITTER, customTheme.submitter);
        editor.putInt(MODERATOR, customTheme.moderator);
        editor.putInt(SINGLE_COMMENT_THREAD_BACKGROUND_COLOR, customTheme.singleCommentThreadBackgroundColor);
        editor.putInt(UNREAD_MESSAGE_BACKGROUND_COLOR, customTheme.unreadMessageBackgroundColor);
        editor.putInt(DIVIDER_COLOR, customTheme.dividerColor);
        editor.putInt(NO_PREVIEW_LINK_BACKGROUND_COLOR, customTheme.noPreviewLinkBackgroundColor);
        editor.putInt(VOTE_AND_REPLY_UNAVAILABLE_BUTTON_COLOR, customTheme.voteAndReplyUnavailableButtonColor);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_1, customTheme.commentVerticalBarColor1);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_2, customTheme.commentVerticalBarColor2);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_3, customTheme.commentVerticalBarColor3);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_4, customTheme.commentVerticalBarColor4);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_5, customTheme.commentVerticalBarColor5);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_6, customTheme.commentVerticalBarColor6);
        editor.putInt(COMMENT_VERTICAL_BAR_COLOR_7, customTheme.commentVerticalBarColor7);
        editor.putInt(FAB_ICON_COLOR, customTheme.fabIconColor);
        editor.putInt(CHIP_TEXT_COLOR, customTheme.chipTextColor);
        editor.putBoolean(LIGHT_STATUS_BAR, customTheme.isLightStatusBar);
        editor.putBoolean(LIGHT_NAV_BAR, customTheme.isLightNavBar);
        editor.putBoolean(CHANGE_STATUS_BAR_ICON_COLOR_AFTER_TOOLBAR_COLLAPSED_IN_IMMERSIVE_INTERFACE, customTheme.isChangeStatusBarIconColorAfterToolbarCollapsedInImmersiveInterface);
        editor.apply();
    }
}