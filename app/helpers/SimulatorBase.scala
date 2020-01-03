// package helpers

// import com.terainsights.napoca._
// import scalaz._
// import Scalaz._


// case class SimpleHostResources(vcpus: Int, memory: Long, devices: Map[String, Int]) extends HostResources {
//     def +(added: HostResources) = SimpleHostResources(vcpus = this.vcpus + added.vcpus,
//                                              memory = memory + added.memory,
//                                              devices = devices |+| added.devices)
  
//     def -(other: HostResources) = {
//       val inv = other.devices.map{case (k, v) => (k, -1 * v)}
//       val d = (this.devices |+| inv).filter{case (k, v) => v > 0}
//       this.copy(vcpus = vcpus - other.vcpus,
//                 memory = memory - other.memory, d)
//     }
//   }
  
//   object BaseCreator extends HostResourcesCreator {
//     def empty = SimpleHostResources(0, 0L, Map())
  
//     def apply(vcpus: Int, memory: Long, devices: Map[String, Int]) =
//       SimpleHostResources(vcpus, memory, devices)
//   }