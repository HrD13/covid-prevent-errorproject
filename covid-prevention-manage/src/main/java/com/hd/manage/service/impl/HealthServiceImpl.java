package com.hd.manage.service.impl;

import com.hd.manage.entity.Health;
import com.hd.manage.mapper.HealthMapper;
import com.hd.manage.service.IHealthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hd
 * @since 2023-01-30
 */
@Service
public class HealthServiceImpl extends ServiceImpl<HealthMapper, Health> implements IHealthService {

}
