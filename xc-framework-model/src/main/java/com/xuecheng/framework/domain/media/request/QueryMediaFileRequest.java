package com.xuecheng.framework.domain.media.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

@Data
public class QueryMediaFileRequest extends RequestData {

    //文件的原始名称
    private String fileOriginalName;
    //文件的处理状态
    private String processStatus;
    //对文件管理的标签
    private String tag;

}
