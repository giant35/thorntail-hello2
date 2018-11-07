/*
 *  copyright (c) thelook.cn
 */
package demo.swarm3;

import java.util.Objects;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.sql.DataSource;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author 老唐
 */
@Stateless
public class CheckBean {

    private static final Logger LOG = Logger.getLogger(CheckBean.class.getName());

    @Resource
    DataSource ds;

    @Schedule(hour = "*", minute = "*", second = "*")
    public void ss() {
        LOG.info("ss enter..." + StringUtils.trim("a a a a "));
        Objects.requireNonNull(ds);
    }
}
