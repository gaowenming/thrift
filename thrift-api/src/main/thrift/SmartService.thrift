namespace java com.smart.thrift.service.api

include "SmartTypes.thrift"

service SmartService{

SmartTypes.User getUserById(i32 id)

}
