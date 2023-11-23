from utils.point_3d import Point3D

class Camera:
    def init(self) -> None:
        self.location: Point3D = Point3D()

    def move(self, point: Point3D) -> None:
        pass