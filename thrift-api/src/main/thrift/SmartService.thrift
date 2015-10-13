namespace java com.smart.thrift.service.api

include "SmartTypes.thrift"

service TSmartService{

SmartTypes.TUser getUserById(i32 id)

}
