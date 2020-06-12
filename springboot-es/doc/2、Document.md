
###增加文档信息

在索引 dztt-user 中增加一条文档信息。
```
POST /dztt-user/doc
{
    "address": "北京市",
    "age": 29,
    "birthDate": "1990-01-10",
    "createTime": 1579530727699,
    "name": "张三",
    "remark": "来自北京市的张先生",
    "salary": 100
}
```

###获取文档信息
获取 dztt-user 的索引 id=1 的文档信息。

```
GET /dztt-user/doc/1
```

###更新文档信息

更新之前创建的 id=1 的文档信息。

```
PUT /dztt-user/doc/1
{
    "address": "北京市海淀区",
    "age": 29,
    "birthDate": "1990-01-10",
    "createTime": 1579530727699,
    "name": "张三",
    "remark": "来自北京市的张先生",
    "salary": 100
}
```

###删除文档信息

删除之前创建的 id=1 的文档信息。
```
DELETE /dztt-user/doc/1
```