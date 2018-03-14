package com.http.rx.demo.model;

import java.util.List;

/**
 * Created by hero on 2017/11/23.
 */

public class Rsource {
  private int box_id;
  private BoxType box_type;
  private int video_max_count;
  private int place_icon_btn_status;
  private Header header;
  private List<ItemData> contents;

  public int getBox_id() {
    return box_id;
  }

  public void setBox_id(int box_id) {
    this.box_id = box_id;
  }

  public BoxType getBox_type() {
    return box_type;
  }

  public void setBox_type(BoxType box_type) {
    this.box_type = box_type;
  }

  public int getIphone_max_count() {
    return video_max_count;
  }

  public void setIphone_max_count(int iphone_max_count) {
    this.video_max_count = iphone_max_count;
  }

  public int getPlace_icon_btn_status() {
    return place_icon_btn_status;
  }

  public void setPlace_icon_btn_status(int place_icon_btn_status) {
    this.place_icon_btn_status = place_icon_btn_status;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public List<ItemData> getContents() {
    return contents;
  }

  public void setContents(List<ItemData> contents) {
    this.contents = contents;
  }

  public static class BoxType {
    private String name;
    private int id;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }
  }

  public static class ItemData {
    private String showname;
    private String showid;
    private String sub_title;
    private String show_thumburl;
    private String pk_odshow;
    private String videoname;
    private String videoid;
    private String img;
    private String content_type;
    private String content_id;
    private String second_title;
    private String intro;
    private String title;
    private String url;
    private int nav_id;
    private String icon_1arge;
    private String icon;
    private int jump_type;
    private String subjectid;
    private String thumburl;
    private int is_activity;
    private JumpInfo jump_info;


    public JumpInfo getJump_info() {
      return jump_info;
    }

    public void setJump_info(JumpInfo jump_info) {
      this.jump_info = jump_info;
    }

    public String getSubjectid() {
      return subjectid;
    }

    public void setSubjectid(String subjectid) {
      this.subjectid = subjectid;
    }

    public String getThumburl() {
      return thumburl;
    }

    public void setThumburl(String thumburl) {
      this.thumburl = thumburl;
    }

    public int getIs_activity() {
      return is_activity;
    }

    public void setIs_activity(int is_activity) {
      this.is_activity = is_activity;
    }

    public String getVideoname() {
      return videoname;
    }

    public void setVideoname(String videoname) {
      this.videoname = videoname;
    }

    public String getVideoid() {
      return videoid;
    }

    public void setVideoid(String videoid) {
      this.videoid = videoid;
    }

    public String getShowname() {
      return showname;
    }

    public void setShowname(String showname) {
      this.showname = showname;
    }

    public String getShowid() {
      return showid;
    }

    public void setShowid(String showid) {
      this.showid = showid;
    }

    public String getSub_title() {
      return sub_title;
    }

    public void setSub_title(String sub_title) {
      this.sub_title = sub_title;
    }

    public String getShow_thumburl() {
      return show_thumburl;
    }

    public void setShow_thumburl(String show_thumburl) {
      this.show_thumburl = show_thumburl;
    }

    public String getPk_odshow() {
      return pk_odshow;
    }

    public void setPk_odshow(String pk_odshow) {
      this.pk_odshow = pk_odshow;
    }

    public String getImg() {
      return img;
    }

    public void setImg(String img) {
      this.img = img;
    }

    public String getContent_type() {
      return content_type;
    }

    public void setContent_type(String content_type) {
      this.content_type = content_type;
    }

    public String getContent_id() {
      return content_id;
    }

    public void setContent_id(String content_id) {
      this.content_id = content_id;
    }

    public String getSecond_title() {
      return second_title;
    }

    public void setSecond_title(String second_title) {
      this.second_title = second_title;
    }

    public String getIntro() {
      return intro;
    }

    public void setIntro(String intro) {
      this.intro = intro;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url) {
      this.url = url;
    }

    public int getNav_id() {
      return nav_id;
    }

    public void setNav_id(int nav_id) {
      this.nav_id = nav_id;
    }

    public String getIcon_1arge() {
      return icon_1arge;
    }

    public void setIcon_1arge(String icon_1arge) {
      this.icon_1arge = icon_1arge;
    }

    public String getIcon() {
      return icon;
    }

    public void setIcon(String icon) {
      this.icon = icon;
    }

    public int getJump_type() {
      return jump_type;
    }

    public void setJump_type(int jump_type) {
      this.jump_type = jump_type;
    }
  }

  public static class Header {
    private String image;
    private String image_link;
    private String title;
    private JumpInfo jump_info;
    private boolean showVVCountIcon;

    public boolean isShowVVCountIcon() {
      return showVVCountIcon;
    }

    public void setShowVVCountIcon(boolean showVVCountIcon) {
      this.showVVCountIcon = showVVCountIcon;
    }

    public String getImage() {
      return image;
    }

    public void setImage(String image) {
      this.image = image;
    }

    // public String getImage_link() {
    // return image_link;
    // }
    //
    // public void setImage_link(String image_link) {
    // this.image_link = image_link;
    // }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public JumpInfo getJump_info() {
      return jump_info;
    }

    public void setJump_info(JumpInfo jump_info) {
      this.jump_info = jump_info;
    }


  }

  public class JumpInfo {
    private String type;
    private String resultApi;
    private String facetsApi;

    private String tabsApi;
    private String listApi;

    private int position;
    private int id;
    private int isFromSubjectCard = 0;

    public String getTabsApi() {
      return tabsApi;
    }

    public void setTabsApi(String tabsApi) {
      this.tabsApi = tabsApi;
    }

    public String getListApi() {
      return listApi;
    }

    public void setListApi(String listApi) {
      this.listApi = listApi;
    }

    public int getIsFromSubjectCard() {
      return isFromSubjectCard;
    }

    public void setIsFromSubjectCard(int isFromSubjectCard) {
      this.isFromSubjectCard = isFromSubjectCard;
    }

    public int getPosition() {
      return position;
    }

    public void setPosition(int position) {
      this.position = position;
    }

    public String getResultApi() {
      return resultApi;
    }

    public void setResultApi(String resultApi) {
      this.resultApi = resultApi;
    }

    public String getFacetsApi() {
      return facetsApi;
    }

    public void setFacetsApi(String facetsApi) {
      this.facetsApi = facetsApi;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

}
