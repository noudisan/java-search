###1、单条插入
```
POST dztt-user/_doc
{"name":"零零","address":"北京市丰台区","remark":"低层员工","age":29,"salary":3000,"birthDate":"1990-11-11","createTime":"2019-11-11T08:18:00.000Z"}
```

###2、批量插入
```
POST _bulk
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"刘一","address":"北京市丰台区","remark":"低层员工","age":30,"salary":3000,"birthDate":"1989-11-11","createTime":"2019-03-15T08:18:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"陈二","address":"北京市昌平区","remark":"中层员工","age":27,"salary":7900,"birthDate":"1992-01-25","createTime":"2019-11-08T11:15:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"张三","address":"北京市房山区","remark":"中层员工","age":28,"salary":8800,"birthDate":"1991-10-05","createTime":"2019-07-22T13:22:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"李四","address":"北京市大兴区","remark":"高层员工","age":26,"salary":9000,"birthDate":"1993-08-18","createTime":"2019-10-17T15:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"王五","address":"北京市密云区","remark":"低层员工","age":31,"salary":4800,"birthDate":"1988-07-20","createTime":"2019-05-29T09:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"赵六","address":"北京市通州区","remark":"中层员工","age":32,"salary":6500,"birthDate":"1987-06-02","createTime":"2019-12-10T18:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"孙七","address":"北京市朝阳区","remark":"中层员工","age":33,"salary":7000,"birthDate":"1986-04-15","createTime":"2019-06-06T13:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"周八","address":"北京市西城区","remark":"低层员工","age":32,"salary":5000,"birthDate":"1987-09-26","createTime":"2019-01-26T14:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"吴九","address":"北京市海淀区","remark":"高层员工","age":30,"salary":11000,"birthDate":"1989-11-25","createTime":"2019-09-07T13:34:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"郑十","address":"北京市东城区","remark":"低层员工","age":29,"salary":5000,"birthDate":"1990-12-25","createTime":"2019-03-06T12:08:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"萧十一","address":"北京市平谷区","remark":"低层员工","age":29,"salary":3300,"birthDate":"1990-11-11","createTime":"2019-03-10T08:17:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"曹十二","address":"北京市怀柔区","remark":"中层员工","age":27,"salary":6800,"birthDate":"1992-01-25","createTime":"2019-12-03T11:09:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"吴十三","address":"北京市延庆区","remark":"中层员工","age":25,"salary":7000,"birthDate":"1994-10-05","createTime":"2019-07-27T14:22:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"冯十四","address":"北京市密云区","remark":"低层员工","age":25,"salary":3000,"birthDate":"1994-08-18","createTime":"2019-04-22T15:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"蒋十五","address":"北京市通州区","remark":"低层员工","age":31,"salary":2800,"birthDate":"1988-07-20","createTime":"2019-06-13T10:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"苗十六","address":"北京市门头沟区","remark":"高层员工","age":32,"salary":11500,"birthDate":"1987-06-02","createTime":"2019-11-11T18:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"鲁十七","address":"北京市石景山区","remark":"高员工","age":33,"salary":9500,"birthDate":"1986-04-15","createTime":"2019-06-06T14:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"沈十八","address":"北京市朝阳区","remark":"中层员工","age":31,"salary":8300,"birthDate":"1988-09-26","createTime":"2019-09-25T14:00:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}
{"name":"吕十九","address":"北京市西城区","remark":"低层员工","age":31,"salary":4500,"birthDate":"1988-11-25","createTime":"2019-09-22T13:34:00.000Z"}
{"index":{"_index":"dztt-user","_type":"doc"}}`{"name":"丁二十","address":"北京市东城区","remark":"低层员工","age":33,"salary":2100,"birthDate":"1986-12-25","createTime":"2019-03-07T12:08:00.000Z"}
```

###3、查询数据
插入完成后再查询数据，查看之前插入的数据是否存在：

```
GET dztt-user/_search
```

执行后得到下面记录:

```json
{
  "took": 2,
  "timed_out": false,
  "_shards": {
    "total": 1,
    "successful": 1,
    "skipped": 0,
    "failed": 0
  },
  "hits": {
    "total": 20,
    "max_score": 1,
    "hits": [
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "BeN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "刘一",
          "address": "北京市丰台区",
          "remark": "低层员工",
          "age": 30,
          "salary": 3000,
          "birthDate": "1989-11-11",
          "createTime": "2019-03-15T08:18:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "BuN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "陈二",
          "address": "北京市昌平区",
          "remark": "中层员工",
          "age": 27,
          "salary": 7900,
          "birthDate": "1992-01-25",
          "createTime": "2019-11-08T11:15:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "B-N0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "张三",
          "address": "北京市房山区",
          "remark": "中层员工",
          "age": 28,
          "salary": 8800,
          "birthDate": "1991-10-05",
          "createTime": "2019-07-22T13:22:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "CON0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "李四",
          "address": "北京市大兴区",
          "remark": "高层员工",
          "age": 26,
          "salary": 9000,
          "birthDate": "1993-08-18",
          "createTime": "2019-10-17T15:00:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "CeN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "王五",
          "address": "北京市密云区",
          "remark": "低层员工",
          "age": 31,
          "salary": 4800,
          "birthDate": "1988-07-20",
          "createTime": "2019-05-29T09:00:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "CuN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "赵六",
          "address": "北京市通州区",
          "remark": "中层员工",
          "age": 32,
          "salary": 6500,
          "birthDate": "1987-06-02",
          "createTime": "2019-12-10T18:00:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "C-N0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "孙七",
          "address": "北京市朝阳区",
          "remark": "中层员工",
          "age": 33,
          "salary": 7000,
          "birthDate": "1986-04-15",
          "createTime": "2019-06-06T13:00:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "DON0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "周八",
          "address": "北京市西城区",
          "remark": "低层员工",
          "age": 32,
          "salary": 5000,
          "birthDate": "1987-09-26",
          "createTime": "2019-01-26T14:00:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "DeN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "吴九",
          "address": "北京市海淀区",
          "remark": "高层员工",
          "age": 30,
          "salary": 11000,
          "birthDate": "1989-11-25",
          "createTime": "2019-09-07T13:34:00.000Z"
        }
      },
      {
        "_index": "dztt-user",
        "_type": "_doc",
        "_id": "DuN0BW8B7BNodGwRFTRj",
        "_score": 1,
        "_source": {
          "name": "郑十",
          "address": "北京市东城区",
          "remark": "低层员工",
          "age": 29,
          "salary": 5000,
          "birthDate": "1990-12-25",
          "createTime": "2019-03-06T12:08:00.000Z"
        }
      }
    ]
  }
}
```