package com.leeorz.lib.util;

import android.text.TextUtils;

import com.orhanobut.logger.Logger;

/**
 * Desc:
 * Created by 庞承晖
 * Date: 2015/12/7.
 * Time: 17:07
 */
public class PatternUtils {

    /**
     * 转义正则特殊字符 （$()*+.[]?\^{},|）
     *
     * @param keyword
     * @return
     */
    public static String escapeExprSpecialWord(String keyword) {
        Logger.v(PatternUtils.class.getSimpleName(), "before:" + keyword);
        if (!TextUtils.isEmpty(keyword)) {
            String[] fbsArr = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
            for (String key : fbsArr) {
                if (keyword.contains(key)) {
                    keyword = keyword.replace(key, "\\" + key);
                }
            }
        }
        Logger.v(PatternUtils.class.getSimpleName(), "after:" + keyword);
        return keyword;
    }
}
