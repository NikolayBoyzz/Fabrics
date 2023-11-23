from utils.point_3d import Point3D

from utils.color import Color


class Flash:
    def init(self) -> None:
        self.location: Point3D = Point3D()

        self.color: Color = Color()


    def move(self, point: Point3D) -> None:
        pass