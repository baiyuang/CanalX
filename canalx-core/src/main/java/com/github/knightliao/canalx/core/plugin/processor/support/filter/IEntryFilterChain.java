package com.github.knightliao.canalx.core.plugin.processor.support.filter;

import com.github.knightliao.canalx.core.dto.MysqlEntryWrap;
import com.github.knightliao.canalx.core.exception.CanalxProcessorException;

/**
 * @author knightliao
 * @date 2016/12/7 19:34
 */
public interface IEntryFilterChain {

    void doFilter(MysqlEntryWrap entry) throws CanalxProcessorException;

}
